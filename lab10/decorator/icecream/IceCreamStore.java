package lab10.decorator.icecream;

public class IceCreamStore {
    public static void main(String[] args) {
        IceCream myIceCream = new VanillaIceCream();
        myIceCream = new HoneyToppingDecorator(myIceCream);
        myIceCream = new NutsToppingDecorator(myIceCream);

        System.out.println(myIceCream.getDescription());
    }
}
