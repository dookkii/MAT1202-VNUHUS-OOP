package lab10.decorator.icecream;

public class NutsToppingDecorator extends ToppingDecorator {
    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String addTopping() {
        return "Nuts";
    }
}
