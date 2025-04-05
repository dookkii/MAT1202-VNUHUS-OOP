package lab6.exercise1_6;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}
