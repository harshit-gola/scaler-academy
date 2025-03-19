package Design_Patterns.Structural.Adapter.SocialAdaptor.Adaptor;

public class SocialMediaPost {
    private String id;
    private String text;
    private Long userId;
    private Long timestamp;

    SocialMediaPost(String id, String text, Long userId, Long timestamp) {
        this.id = id;
        this.text = text;
        this.userId = userId;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}