package lab10.iterator.social;

public class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            System.out.println("Sending message to: " + profile.getEmail() + ": " + message);
        }
    }
}