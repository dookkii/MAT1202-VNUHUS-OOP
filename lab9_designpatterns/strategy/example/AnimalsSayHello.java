package lab9_designpatterns.strategy.example;

public class AnimalsSayHello {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void animalSaysHello() {
        animal.sayHello();
    }
}
