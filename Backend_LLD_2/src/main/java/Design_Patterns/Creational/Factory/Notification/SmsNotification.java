package Design_Patterns.Creational.Factory.Notification;

public class SmsNotification extends Notification {
    private String message;
    private String recipient;

    public SmsNotification(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to " + recipient);
        System.out.println("Message: " + message);
    }
}
