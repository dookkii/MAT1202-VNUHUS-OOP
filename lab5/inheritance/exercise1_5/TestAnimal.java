package lab5.inheritance.exercise1_5;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal);

        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal);

        Dog dog = new Dog("Buddy");
        System.out.println(dog);
        dog.greets();

        Dog dog2 = new Dog("Max");
        dog.greets(dog2);

        Cat cat = new Cat("Whiskers");
        System.out.println(cat);
        cat.greets();
    }
}
