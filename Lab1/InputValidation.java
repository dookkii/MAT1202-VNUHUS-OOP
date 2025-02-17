package hus.oop.lab1;

import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		int numberIn;
		boolean isValid = false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter a number between 0-10 or 90-100: ");
			numberIn = sc.nextInt();
			
			if ((0 <= numberIn && numberIn <= 10) || (90 <= numberIn && numberIn <= 100)) {
				isValid = true;
			} else {
				System.out.println("Invalid input, try again...");
			}
		} while (!isValid);
		
		System.out.println("You have entered: " + numberIn);
		
		sc.close();
	}
}
