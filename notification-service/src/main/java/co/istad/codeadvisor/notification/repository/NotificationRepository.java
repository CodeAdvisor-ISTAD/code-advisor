package co.istad.codeadvisor.notification.repository;

import co.istad.codeadvisor.notification.domain.Notification;
import co.istad.codeadvisor.notification.domain.NotificationData;
import co.istad.codeadvisor.notification.domain.NotificationType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {

    Notification findByNotificationType(String notificationType);

    Notification findByNotificationData(String notificationData);
}
