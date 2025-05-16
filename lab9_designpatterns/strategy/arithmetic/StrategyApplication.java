package lab9_designpatterns.strategy.arithmetic;

import java.util.Scanner;

public class StrategyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        StrategyController controller = new StrategyController();

        controller.setStrategy(new ConcreteStrategyAdd());
        System.out.println("Cộng: " + controller.executeStrategy(a, b));

        controller.setStrategy(new ConcreteStrategySubtract());
        System.out.println("Trừ : " + controller.executeStrategy(a, b));

        controller.setStrategy(new ConcreteStrategyMultiply());
        System.out.println("Nhân: " + controller.executeStrategy(a, b));
    }
}
