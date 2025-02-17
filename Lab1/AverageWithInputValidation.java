package hus.oop.lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
	public static void main(String[] args) {
		final int NUM_STUDENTS = 3;
		int numberIn;
		boolean isValid;
		int sum = 0;
		double average;
		
		Scanner sc = new Scanner(System.in);

		for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
			isValid = false;	
			
			do {
				System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
				numberIn = sc.nextInt();
				
				if (0 <= numberIn && numberIn <= 100) {
					isValid = true;
				} else {
					System.out.println("Invalid input, try again...");
				}
			} while (!isValid);
			
			sum += numberIn;
		}
		
		average = (double) sum / NUM_STUDENTS;
		System.out.printf("The average is: %.2f", average);
		
		sc.close();
	}
}
