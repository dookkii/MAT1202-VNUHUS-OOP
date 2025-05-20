package lab10.factorymethod.dialog;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a button in HTML style.");
    }

    @Override
    public void onClick() {
        System.out.println("(Web browser click) Clicked.");
    }
}
