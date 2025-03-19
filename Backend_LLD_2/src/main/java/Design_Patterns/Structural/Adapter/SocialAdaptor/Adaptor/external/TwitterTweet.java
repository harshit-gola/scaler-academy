package Design_Patterns.Structural.Adapter.SocialAdaptor.Adaptor.external;

public class TwitterTweet {
    private String id;
    private String tweet;
    private Long userId;

    public TwitterTweet(String number, String helloWorld, long l) {
        this.id = number;
        this.tweet = helloWorld;
        this.userId = l;
    }

    public String getId() {
        return id;
    }

    public String getTweet() {
        return tweet;
    }

    public Long getUserId() {
        return userId;
    }
}
