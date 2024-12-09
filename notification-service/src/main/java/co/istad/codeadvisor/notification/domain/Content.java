package co.istad.codeadvisor.notification.domain;

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

    // Represents of the Content or Forum
    private String notificationData;

    // Enum for notification types LIKE, COMMENT, REPLIES
    private String notificationType;
    private boolean isRead;
    private String senderId;
    private String receiverId;
    private LocalDateTime createdAt;

}

