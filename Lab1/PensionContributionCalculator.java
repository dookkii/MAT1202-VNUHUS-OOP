package hus.oop.lab1;

import java.util.Scanner;

public class PensionContributionCalculator {
	public static void main(String[] args) {
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		int salary;
		int age;
		
		int contributableSalary;
		double employeeContribution;
		double employerContribution;
		double totalContribution;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: $");
		salary = sc.nextInt();
		System.out.print("Enter the age: ");
		age = sc.nextInt();
		
		contributableSalary = Math.min(salary, SALARY_CEILING);
		
		if (age <= 55) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
		} else if (age <= 60) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
			employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
		} else if (age <= 65) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
			employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
		} else {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
			employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
		}

		totalContribution = employeeContribution + employerContribution;
		
		System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
		System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
		System.out.printf("The total contribution is: $%.2f%n", totalContribution);
		
		sc.close();
	}
}
