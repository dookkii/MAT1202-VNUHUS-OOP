package lab10.visitor.mailclient2;

public class MailClientVisitorTest {
    private static MacMailClientVisitor macVisitor;
    private static LinuxMailClientVisitor linuxVisitor;
    private static WindowsMailClientVisitor windowsVisitor;
    private static OperaMailClient operaMailClient;
    private static SquirrelMailClient squirrelMailClient;
    private static ZimbraMailClient zimbraMailClient;

    public static void main(String[] args) {
        setup();
        testSquirrelMailClient();
        testOperaMailClient();
        testZimbraMailClient();
    }

    public static void setup() {
        macVisitor = new MacMailClientVisitor();
        linuxVisitor = new LinuxMailClientVisitor();
        windowsVisitor = new WindowsMailClientVisitor();
        operaMailClient = new OperaMailClient();
        squirrelMailClient = new SquirrelMailClient();
        zimbraMailClient = new ZimbraMailClient();
    }

    public static void testOperaMailClient() {
        System.out.println("---Testing Opera Mail Client for different environments---");
        operaMailClient.accept(macVisitor);
        operaMailClient.accept(linuxVisitor);
        operaMailClient.accept(windowsVisitor);
    }

    public static void testSquirrelMailClient() {
        System.out.println("---Testing Squirrel Mail Client for different environments---");
        squirrelMailClient.accept(macVisitor);
        squirrelMailClient.accept(linuxVisitor);
        squirrelMailClient.accept(windowsVisitor);
    }

    public static void testZimbraMailClient() {
        System.out.println("---Testing Zimbra Mail Client for different environments---");
        zimbraMailClient.accept(macVisitor);
        zimbraMailClient.accept(linuxVisitor);
        zimbraMailClient.accept(windowsVisitor);
    }
}
