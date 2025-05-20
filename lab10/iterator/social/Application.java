package lab10.iterator.social;

public class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;

    public void config(boolean useFacebook) {
        if (useFacebook) {
            this.network = new Facebook();
        }

        this.spammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getProfileId());
        spammer.send(iterator, "Message to Friends");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getProfileId());
        spammer.send(iterator, "Message to Coworkers");
    }

    public static void main(String[] args) {
        Application app = new Application();

        app.config(true);

        Profile myProfile = new Profile("tunaa", "nguyenductuan@facebook.com");

        app.sendSpamToFriends(myProfile);
        app.sendSpamToCoworkers(myProfile);
    }
}
