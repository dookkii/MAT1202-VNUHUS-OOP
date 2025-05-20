package lab10.factorymethod.dialog;

public class Application {
    static Dialog dialog;

    public static void initialize(String type) {
        switch (type.toLowerCase()) {
            case "windows":
                dialog = new WindowsDialog();
                break;
            case "web":
                dialog = new WebDialog();
                break;
            default:
                throw new IllegalArgumentException("Illegal type.");
        }
    }

    public static void main(String[] args) {
        initialize("web");
        dialog.render();
        initialize("windows");
        dialog.render();
    }
}
