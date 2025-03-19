package Design_Patterns.Creational.Factory.Notification;

public class NotificationFactory {
    public static Notification getNotificationInstanceByName(NotificationType notificationType,
                                                             String message,
                                                             String recipient,
                                                             String sender) {
        return switch (notificationType.name()) {
            case "EMAIL" -> new EmailNotification(recipient, sender, message);
            case "PUSH" -> new PushNotification(recipient, message);
            case "SMS" -> new SmsNotification(recipient, message);
            default -> null;
        };
    }
}
