package lab10.abstractfactory.gui;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        String osName = "win";
        GUIFactory factory;

        if (osName.equals("win")) {
            factory = new WinFactory();
        } else if (osName.equals("mac")) {
            factory = new MacFactory();
        } else {
            throw new IllegalArgumentException();
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
