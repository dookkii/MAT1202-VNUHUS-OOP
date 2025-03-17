package lab4.composition.exercise2_6;

public class AllocatePoints {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];

        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        for (MyPoint point : points) {
            System.out.println(point);
        }
    }
}
