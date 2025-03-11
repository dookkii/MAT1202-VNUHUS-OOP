package Homework3;

import java.util.Scanner;

public class GradesStatistics {
    public static Scanner scanner;

    public static int[] grades;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.println();
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The standard deviation is " + standardDeviation(grades));
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

    public static double average(int[] array) {
        int numberOfStudents = array.length;
        int gradeSum = 0;

        for (int grade : array) {
            gradeSum += grade;
        }

        return (double) Math.round((double) gradeSum / numberOfStudents * 100) / 100;
    }

    public static double median(int[] array) {
        int numberOfStudents = array.length;

        for (int i = 0; i < numberOfStudents - 1; i++) {
            for (int j = i + 1; j < numberOfStudents; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        double value;

        if (numberOfStudents % 2 == 0) {
            value = (double) (array[numberOfStudents / 2 - 1] + array[numberOfStudents / 2]) / 2;
        } else {
            value = array[(numberOfStudents + 1) / 2];
        }

        return (double) Math.round(value * 100) / 100;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int grade : array) {
            max = Math.max(grade, max);
        }

        return max;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int grade : array) {
            min = Math.min(grade, min);
        }

        return min;
    }

    public static double standardDeviation(int[] array) {
        int numberOfStudents = array.length;
        double gradeAverage = average(array);
        double sum = 0;

        for (double grade : array) {
            sum += Math.pow(grade - gradeAverage, 2);
        }

        return (double) Math.round(Math.sqrt(sum / numberOfStudents) * 100) / 100;
    }
}
