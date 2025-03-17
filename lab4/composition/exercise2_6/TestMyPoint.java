package lab4.composition.exercise2_6;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3, 4);
        System.out.println(point1.distance(5, 6));
        System.out.println(point1.distance(new MyPoint(5, 6)));
        System.out.println(point1.distance());

        MyPoint point = new MyPoint();
        System.out.println(point);

        point.setX(8);
        point.setY(6);
        System.out.println("x is: " + point.getX());
        System.out.println("y is: " + point.getY());
        point.setXY(3, 0);
        System.out.println(point.getXY()[0]);
        System.out.println(point.getXY()[1]);
        System.out.println(point);

        MyPoint point2 = new MyPoint(6, 4);
        System.out.println(point2);
        System.out.println(point.distance(point2));
        System.out.println(point2.distance(point));
        System.out.println(point.distance(5, 6));
        System.out.println(point.distance());
    }
}
