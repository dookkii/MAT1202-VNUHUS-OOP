package lab10.visitor.mailclient1;

public class MailClientTest {
    public static void main(String[] args) throws Exception {
        testConfigureMailClientForDifferentEnvironments();
    }

    public static void testConfigureMailClientForDifferentEnvironments() {
        MailClient operaMailClient = new OperaMailClient();
        operaMailClient.configureForMac();
        operaMailClient.configureForWindows();

        MailClient squirrelMailClient = new SquirrelMailClient();
        squirrelMailClient.configureForMac();
        squirrelMailClient.configureForWindows();
    }
}
