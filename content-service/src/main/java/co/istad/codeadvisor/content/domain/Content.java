package co.istad.codeadvisor.content.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
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

