package lab10.iterator.social;

import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private final Facebook facebook;
    private final String profileId;
    private final String type;
    private int currentPosition;
    private List<Profile> cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.currentPosition = 0;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    @Override
    public Profile getNext() {
        if (hasMore()) {
            return cache.get(currentPosition++);
        }

        return null;
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.size();
    }
}
