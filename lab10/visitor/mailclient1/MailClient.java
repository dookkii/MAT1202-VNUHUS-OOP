package lab10.visitor.mailclient1;

public interface MailClient {
    void sendMail(String[] mailInfo);
    void receiveMail(String[] mailInfo);
    boolean configureForMac();
    boolean configureForWindows();
}
