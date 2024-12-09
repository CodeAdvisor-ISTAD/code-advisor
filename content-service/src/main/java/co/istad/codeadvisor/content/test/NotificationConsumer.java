//package co.istad.codeadvisor.content.test;
//
//import co.istad.codeadvisor.content.domain.Content;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Component
//public class NotificationConsumer {
//
//    @KafkaListener(topics = "notifications", groupId = "notification-group")
//    public void consumeNotification(Content content) {
//        log.info("Consumed Notification: {}", content);
//        // Process the notification as needed
//    }
//}
