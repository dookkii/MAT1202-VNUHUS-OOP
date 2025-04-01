package homework5.exercise1_7;

public class TestPlayer {
    public static void main(String[] args) {
        Player player = new Player(1, 0.0f, 0.0f);
        Ball ball = new Ball(0.0f, 0.0f, 0.0f);
        player.move(1.0f, 1.0f);
        player.jump(1.0f);
        System.out.println(player.near(ball));
        player.kick(ball);
        System.out.println(player.near(ball));
        player.move(5.0f, 5.0f);
        System.out.println(player.near(ball));
        player.kick(ball);
    }
}
