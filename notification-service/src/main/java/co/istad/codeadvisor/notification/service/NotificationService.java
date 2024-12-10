package co.istad.codeadvisor.notification.service;

import co.istad.codeadvisor.notification.domain.Notification;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final SimpMessagingTemplate messagingTemplate;

    @Bean
    public Function<KStream<String, Notification>, KStream<String, Notification>> notificationProcessor() {

        return input -> input.peek((key, content) -> {

            System.out.println("Processing notification: " + content);

            // Add your processing logic here
            // Save into your database

            messagingTemplate.convertAndSend("/topic/notifications", content);
        });

    }

}
