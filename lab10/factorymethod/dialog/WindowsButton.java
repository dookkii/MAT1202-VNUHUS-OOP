package lab10.factorymethod.dialog;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a button in Windows style.");
    }

    @Override
    public void onClick() {
        System.out.println("(Native OS Click event) Clicked.");
    }
}
