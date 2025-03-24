package lab5.composition.exercise2_2;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        Circle circle3 = new Circle(2.0, "Blue");

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println("circle1 Area: " + circle1.getArea());
        System.out.println("circle2 Area: " + circle2.getArea());
        System.out.println("circle3 Area: " + circle3.getArea());

        circle1.setRadius(3.0);
        circle1.setColor("Green");
        System.out.println("Updated circle1: " + circle1);

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(3.0);
        Cylinder cylinder3 = new Cylinder(3.0, 5.0);
        Cylinder cylinder4 = new Cylinder(3.0, 5.0, "Yellow");

        System.out.println("cylinder1 Volume: " + cylinder1.getVolume());
        System.out.println("cylinder2 Volume: " + cylinder2.getVolume());
        System.out.println("cylinder3 Volume: " + cylinder3.getVolume());
        System.out.println("cylinder4 Volume: " + cylinder4.getVolume());

        cylinder1.setHeight(6.0);
        cylinder2.setBaseRadius(4.0);
        cylinder2.setBaseColor("Purple");
        cylinder3.setBase(5.0, "Orange");

        System.out.println("Updated cylinder1 Volume: " + cylinder1.getVolume());
        System.out.println("Updated cylinder2 Volume: " + cylinder2.getVolume());
        System.out.println("Updated cylinder3 Volume: " + cylinder3.getVolume());
    }
}
