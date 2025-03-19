package Design_Patterns.Structural.Adapter.SocialAdaptor.Adaptor;

import Design_Patterns.Structural.Adapter.SocialAdaptor.Adaptor.external.FacebookApi;

import java.util.List;

public class FacebookApiAdapter implements SocialMediaAdapter {
    FacebookApi facebookApi = new FacebookApi();

    @Override
    public List<SocialMediaPost> getPosts(Long userid, Long timestamp) {
        return facebookApi.fetchFacebookPosts(userid, timestamp)
                .stream()
                .map(p -> new SocialMediaPost(p.getId(), p.getStatus(), p.getUserId(), p.getTimestamp()))
                .toList();
    }

    @Override
    public void post(Long userId, String text) {
        facebookApi.postFacebookStatus(userId, text);
    }

}
