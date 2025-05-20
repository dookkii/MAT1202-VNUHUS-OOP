package lab10.decorator.realworldexample;

public abstract class ToppingDecorator extends Pizza {
    protected  Pizza pizza;

    public abstract String getDescription();
}
