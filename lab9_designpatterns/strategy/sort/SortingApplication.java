package lab9_designpatterns.strategy.sort;

import java.util.Arrays;

public class SortingApplication {
    public static void main(String[] args) {
        int[] data1 = {42, 17, 83, 5, 96, 30, 71, 8, 54, 61};
        int[] data2 = data1.clone();
        int[] data3 = data1.clone();

        SortingContext context = new SortingContext();

        context.setAlgorithm(new BubbleSort());
        context.sort(data1);
        System.out.println("Sorted \"Data 1\".");
        System.out.println("Data 1: " + Arrays.toString(data1));
        System.out.println("Data 2: " + Arrays.toString(data2));
        System.out.println("Data 3: " + Arrays.toString(data3));

        System.out.println();

        context.setAlgorithm(new InsertionSort());
        context.sort(data2);
        System.out.println("Sorted \"Data 2\".");
        System.out.println("Data 1: " + Arrays.toString(data1));
        System.out.println("Data 2: " + Arrays.toString(data2));
        System.out.println("Data 3: " + Arrays.toString(data3));

        System.out.println();

        context.setAlgorithm(new SelectionSort());
        context.sort(data3);
        System.out.println("Sorted \"Data 3\".");
        System.out.println("Data 1: " + Arrays.toString(data1));
        System.out.println("Data 2: " + Arrays.toString(data2));
        System.out.println("Data 3: " + Arrays.toString(data3));
    }
}
