package lab10.abstractfactory.gui;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}