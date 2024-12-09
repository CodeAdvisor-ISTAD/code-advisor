package co.istad.codeadvisor.notification.consumer;

import co.istad.codeadvisor.notification.domain.Content;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
@RequiredArgsConstructor
public class NotificationConsumer {

    private final SimpMessagingTemplate messagingTemplate;

    @KafkaListener(topics = "content-events", groupId = "notification-group")
    public void consumeNotification(@Payload Content notification) {

        System.out.println("Processing notification: " + notification);

        notification.setCreatedAt(LocalDateTime.now());


        // Send the notification to WebSocket clients
        messagingTemplate.convertAndSend("/topic/notifications", notification);
    }
}