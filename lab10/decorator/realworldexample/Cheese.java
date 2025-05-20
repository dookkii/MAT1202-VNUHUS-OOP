package lab10.decorator.realworldexample;

public class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost();
    }
}
