package lab10.decorator.structure;

public class App {
    public static void main(String[] args) {
        AbstractComponent component = new ConcreteComponent();
        BaseDecorator decorator = new ConcreteDecorator(component);
        decorator.execute();
    }
}
