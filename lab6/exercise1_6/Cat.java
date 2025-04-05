package lab6.exercise1_6;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
