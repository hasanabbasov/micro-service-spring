package microservice.customer;

import lombok.AllArgsConstructor;
import microservice.amqp.RabbitMQMessageProducer;
import microservice.client.fraud.FraudCheckResponse;
import microservice.client.fraud.FraudClient;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;


    private final RabbitMQMessageProducer rabbitMQMessageProducer;


    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

        if(fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("Customer is a fraud");
        }
        rabbitMQMessageProducer.publish(customer.getId(),"internal.exchange","internal.notification.routing-key");
    }
}
