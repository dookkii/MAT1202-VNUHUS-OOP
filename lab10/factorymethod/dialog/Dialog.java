package lab10.factorymethod.dialog;

public abstract class Dialog {
    public abstract Button createButton();

    public void render() {
        Button okButton = createButton();

        okButton.onClick();
        okButton.render();
    }
}
