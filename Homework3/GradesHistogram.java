package Homework3;

import java.util.Scanner;

public class GradesHistogram {
    public static Scanner scanner;

    public static int[] grades;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        readGrades();
//        grades = new int[] {1, 2, 3, 11, 12, 16, 45, 53, 54, 55, 56, 57, 88, 90, 91};
        System.out.print("The grades are: ");
        print(grades);
        System.out.println();

        int[] frequencies = new int[10];
        analyzeGrades(grades, frequencies);

        printHorizontalHistogram(frequencies);
        System.out.println();
        printVerticalHistogram(frequencies);
    }

    public static void readGrades() {
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        grades = new int[numberOfStudents];

        for (int index = 0; index < numberOfStudents; index++) {
            System.out.print("Enter the grade for student " + (index + 1) + ": ");
            grades[index] = scanner.nextInt();
        }
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                System.out.print(array[index]);
            } else {
                System.out.print(array[index] + ", ");
            }
        }
        System.out.print("]");
    }

    public static void analyzeGrades(int[] array, int[] frequencies) {
        for (int grade : array) {
            int index = grade / 10;
            if (index == 10) {
                frequencies[9]++;
            } else {
                frequencies[index]++;
            }
        }
    }

    public static void printHorizontalHistogram(int[] frequencies) {
        for (int index = 0; index < 10; index++) {
            int lowerBound = index * 10;
            int upperBound = index * 10 + 9;
            if (upperBound == 99) {
                upperBound = 100;
            }

            System.out.printf("%2d - %3d: ", lowerBound, upperBound);
            for (int starNo = 1; starNo <= frequencies[index]; starNo++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printVerticalHistogram(int[] frequencies) {
        int maxFrequency = frequencies[0];
        for (int frequency : frequencies) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        for (int starNo = maxFrequency; starNo > 0; starNo--) {
            for (int index = 0; index < 10; index++) {
                if (index == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }

                if (starNo <= frequencies[index]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                if (index == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }

                System.out.print("  ");
            }
            System.out.println();
        }

        for (int index = 0; index < 10; index++) {
            int lowerBound = index * 10;
            int upperBound = index * 10 + 9;
            if (upperBound == 99) {
                upperBound = 100;
            }

            System.out.printf("%d-%d  ", lowerBound, upperBound);
        }
    }
}
