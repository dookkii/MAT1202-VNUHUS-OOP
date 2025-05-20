package lab10.observer.texteditor;

public class EmailAlertsListener implements EventListener {
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        System.out.println("Sent to \"" + email + "\": " + String.format(message, filename));
    }
}
