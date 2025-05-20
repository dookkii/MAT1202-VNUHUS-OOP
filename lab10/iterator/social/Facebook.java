package lab10.iterator.social;

import java.util.Arrays;
import java.util.List;

public class Facebook implements SocialNetwork {
    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friend");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworker");
    }

    public List<Profile> socialGraphRequest(String profileId, String type) {
        if (type.equals("friend")) {
            return Arrays.asList(
                    new Profile("abc", "abc@facebook.com"),
                    new Profile("xyz", "xyz@facebook.com"));
        } else {
            return Arrays.asList(
                    new Profile("123456", "123456@facebook.com"),
                    new Profile("7890", "7890@facebook.com"));
        }
    }
}
