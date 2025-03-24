package lab5.composition.exercise2_1;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1);

        System.out.println("Point: " + p1.getXY()[0] + " " + p1.getXY()[1]);
        System.out.println("Point X: " + p1.getX());
        System.out.println("Point Y: " + p1.getY());

        p1.setX(2);
        p1.setY(33);
        System.out.println(p1);

        p1.setXY(1, 2);
        System.out.println(p1);
    }
}
