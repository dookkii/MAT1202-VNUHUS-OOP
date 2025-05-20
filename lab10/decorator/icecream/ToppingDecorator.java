package lab10.decorator.icecream;

public abstract class ToppingDecorator extends IceCream {
    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public abstract String addTopping();

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", " + addTopping();
    }
}
