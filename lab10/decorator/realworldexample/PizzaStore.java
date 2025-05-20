package lab10.decorator.realworldexample;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new ThincrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Cheese(cheesePizza);

        System.out.println(greekPizza.getDescription() + " $" + greekPizza.cost());
    }
}
