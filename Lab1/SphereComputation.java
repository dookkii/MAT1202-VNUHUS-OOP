package hus.oop.lab1;

import java.util.Scanner;

public class SphereComputation {
	public static void main(String[] args) {
		double radius;
		double diameter;
		double circumference;
		double area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		radius = sc.nextDouble();
		
		diameter = radius * 2;
		area = Math.PI * radius * radius;
		circumference = (double) 2 * Math.PI * radius;

		System.out.printf("Diameter is: %.2f\n", diameter);
		System.out.printf("Circumference is: %.2f\n", circumference);
		System.out.printf("Area is: %.2f\n", area);
		
		sc.close();
	}
}
