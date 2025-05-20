package lab10.abstractfactory.gui;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOS Button");
    }
}