package lab10.visitor.mailclient1;

public class OperaMailClient implements MailClient {
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println("OperaMailClient: Sending mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("OperaMailClient: Receiving mail");
    }

    @Override
    public boolean configureForMac() {
        System.out.println("Configuration of Opera mail client for Mac complete");
        return true;
    }

    @Override
    public boolean configureForWindows() {
        System.out.println("Configuration of Opera mail client for Windows complete");
        return true;
    }
}
