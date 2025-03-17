package lab4.composition.exercise2_7;

import lab4.composition.exercise2_6.MyPoint;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println("Line 1: " + line1);

        MyPoint begin = new MyPoint(5, 6);
        MyPoint end = new MyPoint(7, 8);
        MyLine line2 = new MyLine(begin, end);
        System.out.println("Line 2: " + line2);

        System.out.println("Line 1 Begin: " + line1.getBegin());
        System.out.println("Line 1 End: " + line1.getEnd());

        line1.setBegin(new MyPoint(0, 0));
        line1.setEnd(new MyPoint(1, 1));
        System.out.println("Line 1: " + line1);

        System.out.println("Line 1 Begin X: " + line1.getBeginX());
        System.out.println("Line 1 Begin Y: " + line1.getBeginY());

        line1.setBeginX(2);
        line1.setBeginY(3);
        System.out.println("Line 1: " + line1);

        System.out.println("Line 1 End X: " + line1.getEndX());
        System.out.println("Line 1 End Y: " + line1.getEndY());

        line1.setEndX(4);
        line1.setEndY(5);
        System.out.println("Line 1: " + line1);

        System.out.println("Line 1 Begin XY: " + line1.getBeginXY()[0] + " " + line1.getBeginXY()[1]);
        System.out.println("Line 1 End XY: " + line1.getEndXY()[0] + " " + line1.getEndXY()[1]);

        line1.setBeginXY(6, 7);
        line1.setEndXY(8, 9);
        System.out.println("Line 1: " + line1);

        System.out.println("Line 1 Length: " + line1.getLength());
        System.out.println("Line 1 Gradient: " + line1.getGradient());

        System.out.println("Line 1: " + line1);
    }
}
