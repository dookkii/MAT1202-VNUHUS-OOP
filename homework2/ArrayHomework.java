package homework2;

import java.util.Scanner;

public class ArrayHomework {
    public static void printArrayInStars(Scanner in) {
        final int NUM_ITEMS;

        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();

        int[] items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int index = 0; index < NUM_ITEMS; index++) {
            items[index] = in.nextInt();
        }
        System.out.println();
        
        for (int index = 0; index < NUM_ITEMS; index++) {
            System.out.print(index + ": ");
            for (int starNo = 0; starNo < items[index]; starNo++) {
                System.out.print("*");
            }
            System.out.println(" (" + items[index] +")");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printArrayInStars(scanner);
    }
}
