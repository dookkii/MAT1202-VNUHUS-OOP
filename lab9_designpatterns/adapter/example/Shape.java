package lab9_designpatterns.adapter.example;

public abstract class Shape {
    public abstract double getPerimeter();

    public boolean isLargerParameter(Shape anotherShape) {
        return (this.getPerimeter() > anotherShape.getPerimeter());
    }
}
