package hus.oop.lab1;

import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int inNumber = sc.nextInt();
		int inDigit;
		
		int reversedNumber = 0;
		while (inNumber > 0) {
			inDigit = inNumber % 10;
			reversedNumber = reversedNumber * 10 + inDigit;
			inNumber /= 10;
		}
		
		System.out.println("The reverse is: " + reversedNumber);
		
		sc.close();
	}
}
