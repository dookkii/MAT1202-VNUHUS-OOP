package lab6.exercise1_8;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        MovableCircle m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        MovableRectangle m3 = new MovableRectangle(0, 0, 1, 1, 2, 3);
        System.out.println(m3);
        m3.moveRight();
        System.out.println(m3);
        m3.moveDown();
        System.out.println(m3);
    }
}
