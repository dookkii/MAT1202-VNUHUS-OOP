package lab5.inheritance.exercise1_5;

public class Mammal extends Animal {
    public Mammal() {
        super();
    }

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
