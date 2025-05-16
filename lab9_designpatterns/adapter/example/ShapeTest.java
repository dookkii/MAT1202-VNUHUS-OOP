package lab9_designpatterns.adapter.example;

public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(3);
        CircleAdapter circleAdapter = new CircleAdapter(circle);

        System.out.println(square.isLargerParameter(circleAdapter));
    }
}
