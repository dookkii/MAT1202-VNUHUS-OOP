package lab6.exercise1_3;

public class TestMovablePoint {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(0, 0, 1, 2);
        System.out.println(movablePoint);

        movablePoint.moveUp();
        System.out.println(movablePoint);

        movablePoint.moveLeft();
        System.out.println(movablePoint);

        movablePoint.moveDown();
        System.out.println(movablePoint);

        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}
