package lab10.factorymethod.juice;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();

        factory.provideFruit("apple");
        factory.provideFruit("orange");
        factory.provideFruit("banana");
    }
}
