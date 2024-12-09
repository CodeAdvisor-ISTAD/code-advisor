package co.istad.codeadvisor.content.producer;
import co.istad.codeadvisor.content.domain.Content;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/content")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class ContentProducedEvent {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping
    public Content createNotification(@RequestBody Content content){

        content.setId(UUID.randomUUID().toString());
//        content.setCreatedAt(LocalDateTime.now());
        content.setRead(false);

        kafkaTemplate.send("content-events", content.getId(), content);

        System.out.println("Content created: " + content);

        return content;
    }

}
