package co.istad.codeadvisor.content.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Content {
    private String id;
    private String title;
    private String message;
    private NotificationData notificationData;
    private NotificationType notificationType;
    private boolean isRead;
    private String senderId;
    private String receiverId;

//    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS")
//    private LocalDateTime createdAt;

}

