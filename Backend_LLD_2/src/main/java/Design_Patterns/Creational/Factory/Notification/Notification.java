package Design_Patterns.Creational.Factory.Notification;

public abstract class Notification {
    private String message;
    private String recipient;

    public abstract NotificationType notificationType();
    public abstract String getRecipient();
    public abstract String getMessage();
    public abstract void sendNotification();
}
