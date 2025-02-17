package hus.oop.lab1;

import java.util.Scanner;

public class SumProductMinMax3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sumProductMinMax3(sc);
		System.out.println();
		sumProductMinMax5(sc);
		
		sc.close();
	}
	
	public static void sumProductMinMax3(Scanner sc) {
		int number1, number2, number3;
		int sum, product, min, max;

		System.out.print("Enter 1st integer: ");
		number1 = sc.nextInt();
		System.out.print("Enter 2nd integer: ");
		number2 = sc.nextInt();
		System.out.print("Enter 3rd integer: ");
		number3 = sc.nextInt();
		
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		min = Math.min(number1, Math.min(number2, number3));
		max = Math.max(number1, Math.max(number2, number3));
	
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		System.out.println("The min is: " + min);
		System.out.println("The max is: " + max);
	}
	
	public static void sumProductMinMax5(Scanner sc) {
		int number1, number2, number3, number4, number5;
		int sum, product, min, max;
		
		System.out.print("Enter 1st integer: ");
		number1 = sc.nextInt();
		System.out.print("Enter 2nd integer: ");
		number2 = sc.nextInt();
		System.out.print("Enter 3rd integer: ");
		number3 = sc.nextInt();
		System.out.print("Enter 4th integer: ");
		number4 = sc.nextInt();
		System.out.print("Enter 5th integer: ");
		number5 = sc.nextInt();
		
		sum = number1 + number2 + number3 + number4 + number5;
		product = number1 * number2 * number3 * number4 * number5;
		min = Math.min(number1, Math.min(number2, Math.min(number3, Math.min(number4, number5))));
		max = Math.max(number1, Math.max(number2, Math.max(number3, Math.max(number4, number5))));
	
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		System.out.println("The min is: " + min);
		System.out.println("The max is: " + max);
	}
}
