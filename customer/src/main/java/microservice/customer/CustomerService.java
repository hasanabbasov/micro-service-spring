package microservice.customer;

import lombok.AllArgsConstructor;
import microservice.client.fraud.FraudCheckResponse;
import microservice.client.fraud.FraudClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;


    public void registerCustomer(CustomerRegistrationRequest request){
        Customer customer = Customer
                .builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

        if (fraudCheckResponse.isFraudster()){
            throw new IllegalStateException("Illegal");
        }


    }
}
