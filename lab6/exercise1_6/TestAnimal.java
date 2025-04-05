package lab6.exercise1_6;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat 1");
        cat.greets();

        Dog dog1 = new Dog("Dog 1");
        Dog dog2 = new Dog("Dog 2");
        dog1.greets();
        dog2.greets();
        dog1.greets(dog2);

        BigDog bigDog1 = new BigDog("Bid Dog 1");
        BigDog bigDog2 = new BigDog("Bid Dog 2");
        bigDog1.greets();
        bigDog2.greets();
        bigDog1.greets(bigDog2);
        bigDog2.greets(dog1);
    }
}
