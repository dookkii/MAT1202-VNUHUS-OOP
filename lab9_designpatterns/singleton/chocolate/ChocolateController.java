package lab9_designpatterns.singleton.chocolate;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        System.out.println("[Boiler 1] Empty: " + boiler.isEmpty() + ", Boiled: " + boiler.isBoiled());
        boiler.boil();
        System.out.println("[Boiler 1] Empty: " + boiler.isEmpty() + ", Boiled: " + boiler.isBoiled());
        boiler.drain();
        System.out.println("[Boiler 1] Empty: " + boiler.isEmpty() + ", Boiled: " + boiler.isBoiled());

        System.out.println();

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        boiler.fill();
        System.out.println("[Boiler 2] Empty: " + boiler.isEmpty() + ", Boiled: " + boiler.isBoiled());
        boiler.boil();
        System.out.println("[Boiler 2] Empty: " + boiler.isEmpty() + ", Boiled: " + boiler.isBoiled());
        boiler.drain();
        System.out.println("[Boiler 2] Empty: " + boiler.isEmpty() + ", Boiled: " + boiler.isBoiled());

    }
}
