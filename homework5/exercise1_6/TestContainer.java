package homework5.exercise1_6;

public class TestContainer {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; step++) {
            ball.move();
            box.collides(ball);
            System.out.println(ball);
        }
    }
}
