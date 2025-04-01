package homework5.exercise1_7;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1, 2, 3);
        System.out.println("Ball x: " + ball.getX());
        System.out.println("Ball y: " + ball.getY());
        System.out.println("Ball z: " + ball.getZ());
        ball.setXYZ(1, 1, 1);
        System.out.println("Ball x: " + ball.getX());
        System.out.println("Ball y: " + ball.getY());
        System.out.println("Ball z: " + ball.getZ());
    }
}
