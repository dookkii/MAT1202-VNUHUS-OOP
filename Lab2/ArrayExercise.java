package Lab2;

import java.util.Scanner;

public class ArrayExercise {
    public static int[] createArray(Scanner sc) {
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = sc.nextInt();
        System.out.print("Enter the value of all items (separated by space): ");

        int[] array = new int[NUM_ITEMS];

        for (int index = 0; index < NUM_ITEMS; index++) {
            array[index] = sc.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        int length = array.length;

        System.out.print("The values are: [");
        for (int i = 0; i < length; i++) {
            System.out.print((i == 0) ? array[i] : ", " + array[i]);
        }
        System.out.println("]");
    }

    public static int[] generateStudentGrades(Scanner sc) {
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] grades = new int[numStudents];

        for (int index = 0; index < numStudents; index++) {
            System.out.print("Enter the grade for student " + (index + 1) + ": ");
            grades[index] = sc.nextInt();
        }

        return grades;
    }

    public static void simpleGradesStatistics(Scanner sc) {
        int[] grades = generateStudentGrades(sc);
        int numStudents = grades.length;

        int sumGrades = 0;
        int minimumGrade = grades[0];
        int maximumGrade = grades[0];

        for (int grade : grades) {
            sumGrades += grade;
            minimumGrade = Math.min(minimumGrade, grade);
            maximumGrade = Math.max(maximumGrade, grade);
        }

        System.out.printf("The average is: %.2f\n", (double) sumGrades / numStudents);
        System.out.println("The minimum is: " + minimumGrade);
        System.out.println("The maximum is: " + maximumGrade);
    }

    public static String hexadecimalToBinary(String hexStr) {
        hexStr = hexStr.toUpperCase();
        int length = hexStr.length();

        final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111", "####"};
        String result = "";

        for (int index = 0; index < length; index++) {
            char character = hexStr.charAt(index);
            int number;

            switch (character) {
                case '0':
                    number = 0;
                    break;
                case '1':
                    number = 1;
                    break;
                case '2':
                    number = 2;
                    break;
                case '3':
                    number = 3;
                    break;
                case '4':
                    number = 4;
                    break;
                case '5':
                    number = 5;
                    break;
                case '6':
                    number = 6;
                    break;
                case '7':
                    number = 7;
                    break;
                case '8':
                    number = 8;
                    break;
                case '9':
                    number = 9;
                    break;
                case 'A':
                    number = 10;
                    break;
                case 'B':
                    number = 11;
                    break;
                case 'C':
                    number = 12;
                    break;
                case 'D':
                    number = 13;
                    break;
                case 'E':
                    number = 14;
                    break;
                case 'F':
                    number = 15;
                    break;
                default:
                    number = 16;
            }

            result += HEX_BITS[number] + " ";
        }
        return result;
    }

    public static void testHexadecimalToBinary(Scanner sc) {
        System.out.print("Enter a Hexadecimal string: ");
        String hexString = sc.next().toUpperCase();

        System.out.println("The equivalent binary for hexadecimal \"" + hexString + "\" is: " + hexadecimalToBinary(hexString));
    }

    public static String reverseString(String inStr) {
        int length = inStr.length();
        String result = "";

        for (int index = length - 1; index >= 0; index--) {
            result += inStr.charAt(index);
        }

        return result;
    }

    public static String decimalToHexadecimal(int positiveInteger) {
        final char[] HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String result = "";

        while (positiveInteger > 0) {
            int digit = positiveInteger % 16;
            result += HEX[digit];
            positiveInteger /= 16;
        }

        return reverseString(result);
    }

    public static void testDecimalToHexadecimal(Scanner sc) {
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        System.out.println("The equivalent hexadecimal number is: " + decimalToHexadecimal(number));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numberArray = createArray(sc);
        printArray(numberArray);
        simpleGradesStatistics(sc);
        testHexadecimalToBinary(sc);
        testDecimalToHexadecimal(sc);
    }
}
