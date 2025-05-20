package lab10.abstractfactory.gui;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOS Checkbox");
    }
}