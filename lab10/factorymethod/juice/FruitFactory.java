package lab10.factorymethod.juice;

public class FruitFactory {
    public void provideFruit(String type) {
        Fruit juice;

        switch (type.toLowerCase()) {
            case "apple":
                juice = new Apple();
                break;
            case "banana":
                juice = new Banana();
                break;
            case "orange":
                juice = new Orange();
                break;
            default:
                throw new IllegalArgumentException("No such fruit.");
        }

        juice.produceJuice();
    }
}
