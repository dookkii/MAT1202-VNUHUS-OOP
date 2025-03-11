package Homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class MathLibraryHomework {
    public static Scanner scanner;

    public static double sin(double x, int numTerms) {
        double result = x;
        double term = x;

        for (int termNo = 3; termNo <= numTerms; termNo += 2) {
            term *= (-1) * Math.pow(x, 2) / (termNo * (termNo - 1));
            result += term;
        }

        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 1;
        double term = 1;

        for (int termNo = 2; termNo <= numTerms; termNo += 2) {
            term *= (-1) * Math.pow(x, 2) / (termNo * (termNo - 1));
            result += term;
        }

        return result;
    }

    public static void testTrigonometric() {
        double PI = Math.PI;
        double[] angles = {0, PI/6, PI/4, PI/3, PI/2};

        for (double angle : angles) {
            double sinOfAngle = sin(angle, 1000);
            double sinOfAngleUsingBuiltIn = Math.sin(angle);
            double cosOfAngle = cos(angle, 1000);
            double cosOfAngleUsingBuiltIn = Math.cos(angle);
            System.out.println("Sin of " + angle + ": " + sinOfAngle);
            System.out.println("Sin of " + angle + " (using built-in function): " + sinOfAngleUsingBuiltIn);
            System.out.println("Delta sin: " + (sinOfAngle - sinOfAngleUsingBuiltIn));
            System.out.println("Cos of " + angle + ": " + cosOfAngle);
            System.out.println("Cos of " + angle + " (using built-in function): " + cosOfAngleUsingBuiltIn);
            System.out.println("Delta cos: " + (cosOfAngle - cosOfAngleUsingBuiltIn));
            System.out.println("-----------------------------");
        }
    }

    public static double specialSeries(double x, int numTerms) {
        double result = x + (double) 1 / 2;
        double term1 = x;
        double term2 = (double) 1 / 2;

        for (int termNo = 3; termNo <= numTerms; termNo++) {
            term1 *= (Math.pow(x, 2) / termNo);
            term2 *= (double) termNo / (termNo + 1);
            result += term1 + term2;
        }

        return result;
    }

    public static void testSpecialSeries() {
        System.out.print("Enter a double: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();
        System.out.println("Result: " + specialSeries(x, numTerms));
    }

    public static int factorialInt(int n) {
        int result = 1;

        for (int index = 2; index <= n; index++) {
            if (Integer.MAX_VALUE / factorialInt(n - 1) < n) {
                return -1;
            } else {
                result *= index;
            }
        }

        return result;
    }

    public static void testFactorialInt() {
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int result = factorialInt(n);

        System.out.println("The factorial of " + n + " is ");
        if (result == -1) {
            System.out.println("out of range.");
        } else {
            System.out.println(result);
        }
    }

    public static long factorialLong(int n) {
        long result = 1;

        for (int index = 2; index <= n; index++) {
            if (Long.MAX_VALUE / factorialLong(n - 1) < n) {
                return -1;
            } else {
                result *= index;
            }
        }

        return result;
    }

    public static void testFactorialLong() {
        System.out.print("Enter n (long): ");
        int n = scanner.nextInt();
        long result = factorialLong(n);

        System.out.println("The factorial of " + n + " is ");
        if (result == -1) {
            System.out.println("out of range.");
        } else {
            System.out.println(result);
        }
    }


    public static int fibonacciInt(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int prevNum1 = fibonacciInt(n - 1);
        int prevNum2 = fibonacciInt(n - 2);

        if (Integer.MAX_VALUE - prevNum1 < prevNum2) {
            return -1;
        } else {
            return prevNum1 + prevNum2;
        }
    }

    public static void testFibonacciInt() {
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int result = fibonacciInt(n);

        System.out.println("F(" + n + ") is");
        if (result == -1) {
            System.out.println("out of range.");
        } else {
            System.out.println(result);
        }
    }

    public static int charToValue(char character) {
        if ('0' <= character && character <= '9') {
            return character - '0';
        } else if ('A' <= character && character <= 'F') {
            return 10 + (character - 'A');
        } else {
            return 0;
        }
    }

    public static char valueToChar(int value) {
        if (0 <= value && value <= 9) {
            return (char) ('0' + value);
        } else if (10 <= value && value <= 16) {
            return (char) ('A' + (value - 10));
        } else {
            return '0';
        }
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        int decimalValue = 0;
        for (char character : in.toCharArray()) {
            int digitValue = charToValue(character);
            decimalValue = decimalValue * inRadix + digitValue;
        }

        if (decimalValue == 0) {
            return "0";
        }

        ArrayList<Character> characterList = new ArrayList<>();
        while (decimalValue > 0) {
            characterList.add(valueToChar(decimalValue % outRadix));
            decimalValue = decimalValue / outRadix;
        }

        String result = "";
        for (int index = characterList.size() - 1; index >= 0; index--) {
            result += characterList.get(index);
        }

        return result;
    }

    public static void testNumberConversion() {
        System.out.print("Enter the string: ");
        String string = scanner.next();
        System.out.print("Enter the input radix: ");
        int inRadix = scanner.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = scanner.nextInt();

        System.out.println("\"" + string + "\" in radix " + inRadix + "is \"" + toRadix(string, inRadix, outRadix) + "\" in radix " + outRadix + ".");
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        testTrigonometric();
        testSpecialSeries();
        testFactorialInt();
        testFactorialLong();
        testFibonacciInt();
        testNumberConversion();
    }
}
