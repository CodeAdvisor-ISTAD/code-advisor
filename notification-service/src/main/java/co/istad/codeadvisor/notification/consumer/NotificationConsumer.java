package co.istad.codeadvisor.notification.consumer;

import co.istad.codeadvisor.notification.domain.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotificationConsumer {

    @KafkaListener(topics = "content-events", groupId = "notification-group")
    public void consumeNotification(Notification notification) {
        log.info("Consumed Notification: {}", notification);
        // Process the notification as needed
    }
}