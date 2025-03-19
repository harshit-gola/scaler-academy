package Design_Patterns.Structural.Adapter.SocialAdaptor.Adaptor;

import java.util.List;

public interface SocialMediaAdapter {
    List<SocialMediaPost> getPosts(Long userid, Long timestamp);
    void post(Long userId, String text);
}
