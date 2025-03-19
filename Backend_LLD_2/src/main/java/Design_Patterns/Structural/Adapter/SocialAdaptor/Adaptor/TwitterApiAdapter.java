package Design_Patterns.Structural.Adapter.SocialAdaptor.Adaptor;

import Design_Patterns.Structural.Adapter.SocialAdaptor.Adaptor.external.TwitterApi;

import java.util.List;

public class TwitterApiAdapter implements SocialMediaAdapter{
    TwitterApi twitterApi = new TwitterApi();

    @Override
    public List<SocialMediaPost> getPosts(Long userid, Long timestamp) {
        return twitterApi.getTweets(userid)
                .stream()
                .map(t -> new SocialMediaPost(t.getId(), t.getTweet(), t.getUserId(), null))
                .toList();
    }

    @Override
    public void post(Long userId, String text) {
        twitterApi.tweet(userId, text);
    }
}