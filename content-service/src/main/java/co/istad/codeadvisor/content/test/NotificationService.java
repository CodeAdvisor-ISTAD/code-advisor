//package co.istad.codeadvisor.content.test;
//
//import co.istad.codeadvisor.content.domain.Content;
//import lombok.RequiredArgsConstructor;
//import org.apache.kafka.streams.kstream.KStream;
//import org.springframework.context.annotation.Bean;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Service;
//
//import java.util.function.Function;
//
//@Service
//@RequiredArgsConstructor
//public class NotificationService {
//
//    private final SimpMessagingTemplate messagingTemplate;
//
//    @Bean
//    public Function<KStream<String, Content>, KStream<String, Content>> notificationProcessor() {
//
//        return input -> input.peek((key, content) -> {
//
//            System.out.println("Processing notification: " + content);
//
//            // Add your processing logic here
//            // Save into your database
//
//            messagingTemplate.convertAndSend("/topic/notifications", content);
//        });
//
//    }
//
//}
