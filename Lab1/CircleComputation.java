package hus.oop.lab1;

import java.util.Scanner;

public class CircleComputation {
	public static void main(String[] args) {
		double radius;
		double volume;
		double surfaceArea;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		radius = sc.nextDouble();
		
		surfaceArea = 4 * Math.PI * radius * radius;
		volume = (double) 4 / 3 * Math.PI * radius * radius * radius;

		System.out.printf("Surface Area is: %.2f\n", surfaceArea);
		System.out.printf("Volume is: %.2f\n", volume);
		
		sc.close();
	}
}
