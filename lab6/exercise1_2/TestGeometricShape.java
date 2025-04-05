package lab6.exercise1_2;

public class TestGeometricShape {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(1);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Circle circle1 = (Circle) circle;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        GeometricObject rectangle = new Rectangle(1, 2);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Rectangle rectangle1 = (Rectangle) rectangle;
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}
