package lab10.decorator.structure;

public class ConcreteComponent extends AbstractComponent {
    @Override
    public void execute() {
        System.out.println("ConcreteComponent.execute()");
    }
}
