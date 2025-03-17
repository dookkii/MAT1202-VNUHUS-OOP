package lab4.classes.exercise1_7;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();

        MyComplex complex1 = new MyComplex(real1, imag1);
        MyComplex complex2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + complex1);
        System.out.println("The second complex: " + complex2);

        if (complex1.isReal()) {
            System.out.println(complex1 + " is a pure real number");
        } else {
            System.out.println(complex1 + " is a NOT pure real number");
        }

        if (complex1.isImaginary()) {
            System.out.println(complex1 + " is a pure imaginary number");
        } else {
            System.out.println(complex1 + " is a NOT pure imaginary number");
        }

        if (complex2.isReal()) {
            System.out.println(complex2 + " is a pure real number");
        } else {
            System.out.println(complex2 + " is a NOT pure real number");
        }

        if (complex2.isImaginary()) {
            System.out.println(complex2 + " is a pure imaginary number");
        } else {
            System.out.println(complex2 + " is a NOT pure imaginary number");
        }

        if (complex1.equals(complex2)) {
            System.out.println(complex1 + " is equal to " + complex2);
        } else {
            System.out.println(complex1 + " is NOT equal to " + complex2);
        }

        System.out.println(complex1 + " + " + complex2 + " = " + complex1.addNew(complex2));
    }
}
