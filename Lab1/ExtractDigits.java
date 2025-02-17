package hus.oop.lab1;

public class ExtractDigits {
	public static void main(String[] args) {
		int n = 15423;
		
		while (n > 0) {
			int digit = n % 10;
			System.out.print(digit + " ");
			n /= 10;
		}
	}
}
