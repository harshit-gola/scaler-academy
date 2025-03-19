package Design_Patterns.Creational.Factory.Notification;

public class EmailNotification extends Notification {
    private String recipient;
    private String message;
    private String sender;

    public EmailNotification(String recipient, String message, String sender) {
        this.recipient = recipient;
        this.message = message;
        this.sender = sender;
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public void sendNotification() {
        System.out.println("Email send to " +recipient +" from " +sender);
        System.out.println("Message : " + message);
    }
}
