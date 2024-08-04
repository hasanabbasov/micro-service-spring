package microservice.notification;

import lombok.RequiredArgsConstructor;
import microservice.client.fraud.NotificationResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;
    public NotificationResponse sendRegisterNotification(Integer customerId) {
        Notification notification = Notification.builder()
                .customerId(customerId)
                .message("Onboarded")
                .build();
        notificationRepository.save(notification);
        return new NotificationResponse(true);
    }
}
