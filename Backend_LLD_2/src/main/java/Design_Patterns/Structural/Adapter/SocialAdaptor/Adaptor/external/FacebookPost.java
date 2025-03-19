package Design_Patterns.Structural.Adapter.SocialAdaptor.Adaptor.external;

public class FacebookPost {
    private String id;
    private String status;
    private Long userId;
    private Long timestamp;

    public FacebookPost(String number, String helloWorld, long l, long l1) {
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }
}
