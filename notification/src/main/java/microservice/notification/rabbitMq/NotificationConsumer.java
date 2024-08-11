package microservice.notification.rabbitMq;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import microservice.notification.NotificationService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class NotificationConsumer {

    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void consumer(Integer customerId) {
        log.info("Consuming message for customer: {}", customerId);
        notificationService.sendRegisterNotification(customerId);
    }
}
