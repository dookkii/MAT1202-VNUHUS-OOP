package lab4.composition.exercise2_10;

import lab4.composition.exercise2_6.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(1, 2, 4, 6);
        System.out.println("Rectangle 1: " + rectangle1);
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        MyPoint topLeft = new MyPoint(0, 0);
        MyPoint bottomRight = new MyPoint(3, 4);
        MyRectangle rectangle2 = new MyRectangle(topLeft, bottomRight);
        System.out.println("Rectangle 2: " + rectangle2);
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        rectangle1.setTopLeft(new MyPoint(420, 420));
        rectangle1.setBottomRight(new MyPoint(69, 69));
        System.out.println("Rectangle 1 Top Left: " + rectangle1.getTopLeft());
        System.out.println("Rectangle 1 Bottom Right: " + rectangle1.getBottomRight());
        System.out.println("Rectangle 1 Top Left XY : " + rectangle1.getTopLeftXY()[0] + " " + rectangle1.getTopLeftXY()[1]);
        System.out.println("Rectangle 1 Bottom Right XY : " + rectangle1.getBottomRightXY()[0] + " " + rectangle1.getBottomRightXY()[1]);

        rectangle2.setTopLeftXY(1, 1);
        rectangle2.setBottomRightXY(5, 5);
        System.out.println("Rectangle 2 Updated: " + rectangle2);
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
