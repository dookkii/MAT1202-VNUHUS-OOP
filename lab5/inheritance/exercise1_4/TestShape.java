package lab5.inheritance.exercise1_4;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape.setColor("blue");
        shape.setFilled(false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        circle.setRadius(5.0);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle.setWidth(4.0);
        rectangle.setLength(6.0);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square();
        System.out.println(square);

        square.setSide(3.0);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        Square square2 = new Square(4.0, "green", true);
        System.out.println(square2);
    }
}
