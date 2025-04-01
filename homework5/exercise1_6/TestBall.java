package homework5.exercise1_6;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        System.out.println("Position: " + ball);
        ball.move();
        System.out.println("After moving: " + ball);
        ball.reflectHorizontal();
        System.out.println("Reflecting horizontally: " + ball);
        ball.reflectVertical();
        System.out.println("Reflecting vertically: " + ball);
    }
}
