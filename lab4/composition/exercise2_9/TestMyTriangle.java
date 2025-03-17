package lab4.composition.exercise2_9;

import lab4.composition.exercise2_6.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println("Triangle 1: " + triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());

        MyPoint v1 = new MyPoint(1, 1);
        MyPoint v2 = new MyPoint(2, 2);
        MyPoint v3 = new MyPoint(3, 1);
        MyTriangle triangle2 = new MyTriangle(v1, v2, v3);
        System.out.println("Triangle 2: " + triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());

        MyTriangle triangle3 = new MyTriangle(0, 0, 1, 0, 6, 7);
        System.out.println("Triangle 3: " + triangle3);
        System.out.println("Perimeter: " + triangle3.getPerimeter());
        System.out.println("Type: " + triangle3.getType());
    }
}
