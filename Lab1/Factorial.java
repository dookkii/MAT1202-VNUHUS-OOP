package hus.oop.lab1;

public class Factorial {
	public static int factorial(int n) {
		if (n == 0)
			return 1;

		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		return result;
	}

	public static void main(String[] args) {
		int factorialValue = factorial(5);

		System.out.println(factorialValue);
	}
}
