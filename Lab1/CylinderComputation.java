package hus.oop.lab1;

import java.util.Scanner;

public class CylinderComputation {
	public static void main(String[] args) {
		double radius;
		double height;
		double baseArea;
		double surfaceArea;
		double volume;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		radius = sc.nextDouble();
		
		System.out.print("Enter the height: ");
		height = sc.nextDouble();
		
		baseArea = Math.PI * radius * radius;
		surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
		volume = baseArea * height;

		System.out.printf("Base Area is: %.2f\n", baseArea);
		System.out.printf("Surface Area is: %.2f\n", surfaceArea);
		System.out.printf("Volume is: %.2f\n", volume);
		
		sc.close();
	}
}
