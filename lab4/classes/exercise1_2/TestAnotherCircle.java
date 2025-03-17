package lab4.classes.exercise1_2;

public class TestAnotherCircle {
    public static void main(String[] args) {
        AnotherCircle circle1 = new AnotherCircle(1.1);
        System.out.println(circle1);
        AnotherCircle circle2 = new AnotherCircle();
        System.out.println(circle2);

        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("Radius is: " + circle1.getRadius());

        System.out.printf("Area is: %.2f%n", circle1.getArea());
        System.out.printf("Area is: %.2f%n", circle1.getCircumference());
    }
}
