package Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberTheory {
    public static boolean isPerfect(int aPosInt) {
        int sumOfFactors = 1;

        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sumOfFactors += i;
            }
        }

        return (aPosInt == sumOfFactors);
    }

    public static boolean isDeficient(int aPosInt) {
        int sumOfFactors = 1;

        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sumOfFactors += i;
            }
        }

        return (aPosInt < sumOfFactors);
    }

    public static void printArrayList(ArrayList<Integer> array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void perfectNumberList(Scanner sc) {
        int upperBound;
        boolean isValid = false;

        do {
            System.out.print("Enter the upper bound: ");
            upperBound = sc.nextInt();

            if (upperBound > 0) {
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);

        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        ArrayList<Integer> deficientNumbers = new ArrayList<>();

        for (int i = 2; i <= upperBound; i++) {
            if (isPerfect(i)) {
                perfectNumbers.add(i);
                continue;
            }

            if (isDeficient(i)) {
                deficientNumbers.add(i);
            }
        }

        System.out.println("These numbers are perfect:");
        printArrayList(perfectNumbers);
        System.out.println();
        int nPerfect = perfectNumbers.size();
        double percentagePerfect = (double) Math.round((double) nPerfect * 10000 / upperBound) / 100;
        System.out.println("[" + nPerfect + " perfect numbers found (" + percentagePerfect + "%)]");

        System.out.println("These numbers are neither deficient nor perfect:");
        printArrayList(deficientNumbers);
        System.out.println();
        int nDeficient = deficientNumbers.size();
        double percentageDeficient = (double) Math.round((double) nDeficient * 10000 / upperBound) / 100;
        System.out.println("[" + nDeficient + " perfect numbers found (" + percentageDeficient + "%)]");
    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt <= 1) {
            return false;
        }

        if (aPosInt == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeList(Scanner sc) {
        int upperBound;
        boolean isValid = false;

        do {
            System.out.print("Enter the upper bound: ");
            upperBound = sc.nextInt();

            if (upperBound > 0) {
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= upperBound; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        System.out.println("These numbers are prime:");
        printArrayList(primeNumbers);
        System.out.println();
        int nPrimes = primeNumbers.size();
        double percentagePrimes = (double) Math.round((double) nPrimes * 10000 / upperBound) / 100;
        System.out.println("[" + nPrimes + " primes found (" + percentagePrimes + "%)]");
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int productOfPrimeFactors = 1;

        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                productOfPrimeFactors *= i;
            }
        }

        return (productOfPrimeFactors == aPosInt);
    }

    public static void perfectPrimeFactorList(Scanner sc) {
        int upperBound;
        boolean isValid = false;

        do {
            System.out.print("Enter the upper bound: ");
            upperBound = sc.nextInt();

            if (upperBound > 0) {
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);

        ArrayList<Integer> perfectPrimeFactorNumbers = new ArrayList<>();

        for (int i = 2; i <= upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                perfectPrimeFactorNumbers.add(i);
            }
        }

        System.out.println("These numbers are equal to the product of prime factors:");
        printArrayList(perfectPrimeFactorNumbers);
        System.out.println();
        int nPrimes = perfectPrimeFactorNumbers.size();
        double percentagePrimes = (double) Math.round((double) nPrimes * 10000 / upperBound) / 100;
        System.out.println("[" + nPrimes + " numbers found (" + percentagePrimes + "%)]");
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void testGCD(Scanner sc) {
        int a, b;
        boolean isValid = false;

        do {
            System.out.print("Enter a and b (a >= b): ");
            a = sc.nextInt();
            b = sc.nextInt();

            if (a >= b) {
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        perfectNumberList(sc);
        primeList(sc);
        perfectPrimeFactorList(sc);
        testGCD(sc);
    }
}
