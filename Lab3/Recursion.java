package Lab3;

public class Recursion {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static int lengthOfRunningNumberSequence(int n) {
        if (n == 1) {
            return 1;
        }

        int numberOfDigits = 0;
        int tmp = n;
        while (tmp > 0) {
            numberOfDigits++;
            tmp /= 10;
        }

        return lengthOfRunningNumberSequence(n - 1) + numberOfDigits;
    }

    public static int greatestCommonDivisor(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) {
            return a;
        }

        return greatestCommonDivisor(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(5));
        System.out.println(lengthOfRunningNumberSequence(12));
        System.out.println(greatestCommonDivisor(30, 35));
    }
}
