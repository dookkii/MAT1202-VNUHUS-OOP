package lab6.exercise1_4;

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(0, 0, 1, 2, 1);
        System.out.println(movableCircle);

        movableCircle.moveUp();
        System.out.println(movableCircle);

        movableCircle.moveLeft();
        System.out.println(movableCircle);

        movableCircle.moveDown();
        System.out.println(movableCircle);

        movableCircle.moveRight();
        System.out.println(movableCircle);
    }
}
