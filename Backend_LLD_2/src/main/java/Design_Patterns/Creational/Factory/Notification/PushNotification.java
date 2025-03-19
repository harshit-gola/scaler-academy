package Design_Patterns.Creational.Factory.Notification;

public class PushNotification extends Notification {
    private String message;
    private String recipient;

    public PushNotification(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
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
        System.out.println("Push notification send to device " +recipient);
        System.out.println("Message: " + message);
    }
}
