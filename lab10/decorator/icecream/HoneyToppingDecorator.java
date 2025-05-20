package lab10.decorator.icecream;

public class HoneyToppingDecorator extends ToppingDecorator {
    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String addTopping() {
        return "Honey";
    }
}
