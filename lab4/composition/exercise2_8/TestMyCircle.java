package lab4.composition.exercise2_8;

import lab4.composition.exercise2_6.MyPoint;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle();
        System.out.println("Circle 1: " + circle1);

        MyCircle circle2 = new MyCircle(3, 4, 5);
        System.out.println("Circle 2: " + circle2);

        MyPoint center = new MyPoint(6, 7);
        MyCircle circle3 = new MyCircle(center, 8);
        System.out.println("Circle 3: " + circle3);

        System.out.println("Circle 1 Radius: " + circle1.getRadius());
        circle1.setRadius(10);
        System.out.println("Circle 1: " + circle1);

        System.out.println("Circle 2 Center: " + circle2.getCenter());
        circle2.setCenter(new MyPoint(1, 2));
        System.out.println("Circle 2: " + circle2);

        System.out.println("Circle 3 Center X: " + circle3.getCenterX());
        System.out.println("Circle 3 Center Y: " + circle3.getCenterY());

        circle3.setCenterX(9);
        circle3.setCenterY(10);
        System.out.println("Circle 3: " + circle3);

        System.out.println("Circle 3 Center XY: " + circle3.getCenterXY()[0] + " " + circle3.getCenterXY()[1]);
        circle3.setCenterXY(11, 12);
        System.out.println("Circle 3: " + circle3);

        System.out.println("Circle 1 Area: " + circle1.getArea());
        System.out.println("Circle 1 Circumference: " + circle1.getCircumference());

        System.out.println("Distance: " + circle2.distance(circle3));

        System.out.println("Circle 1: " + circle1);
    }
}
