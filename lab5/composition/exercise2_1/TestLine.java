package lab5.composition.exercise2_1;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(1, 3);
        Point p2 = new Point(5, 7);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
    }
}
