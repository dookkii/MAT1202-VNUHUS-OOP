package lab10.visitor.mailclient1;

public class SquirrelMailClient implements MailClient {
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println("SquirrelMailClient: Sending mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("SquirrelMailClient: Receiving mail");
    }

    @Override
    public boolean configureForMac() {
        System.out.println("Configuration of Squirrel mail client for Mac complete");
        return true;
    }

    @Override
    public boolean configureForWindows() {
        System.out.println("Configuration of Squirrel mail client for Windows complete");
        return true;
    }
}
