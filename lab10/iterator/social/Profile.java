package lab10.iterator.social;

public class Profile {
    private final String profileId;
    private final String email;

    public Profile(String profileId, String email) {
        this.profileId = profileId;
        this.email = email;
    }

    public String getProfileId() {
        return profileId;
    }

    public String getEmail() {
        return email;
    }
}
