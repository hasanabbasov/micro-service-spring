package microservice.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import microservice.client.fraud.NotificationResponse;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;
    @PostMapping("{customerId}")
    public NotificationResponse sendNotification(@PathVariable("customerId") Integer customerId){
        log.info("Customer registered {}", customerId);
        return notificationService.sendRegisterNotification(customerId);
    }
}
