package Lab3;

public class SortingAndSearching {
    public static boolean linearSearch(int[] array, int key) {
        for (int value: array) {
            if (value == key) {
                return true;
            }
        }

        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        int arrayLength = array.length;
        for (int index = 0; index < arrayLength; index++) {
            if (array[index] == key) {
                return index;
            }
        }

        return 0;
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            return array[fromIdx] == key;
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;

            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }

            return binarySearch(array, key, fromIdx, toIdx);
        }
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length);
    }

    public static void bubbleSort(int[] array) {
        int arrayLength = array.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < arrayLength; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;

                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void selectionSort(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            int minValueIndex = i;

            for (int j = i + 1; j < arrayLength; j++) {
                if (array[minValueIndex] > array[j]) {
                    minValueIndex = j;
                }
            }

            if (minValueIndex != i) {
                int tmp = array[i];
                array[i] = array[minValueIndex];
                array[minValueIndex] = tmp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        int arrayLength = array.length;

        for (int i = 1; i < arrayLength; i++) {
            int value = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = value;
        }
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[] {69, 420, 4, 5, 3}, 3));
        System.out.println(linearSearchIndex(new int[] {69, 420, 4, 5, 3}, 3));
        System.out.println(binarySearch(new int[] {1, 2, 3, 4, 5, 6}, 5));
        System.out.println();

        int[] initArray = {69, 420, 2, 1, 9, 7, 3, 5};
        System.out.print("Initial array: ");
        printArray(initArray);

        int[] array1 = initArray.clone();
        bubbleSort(array1);
        System.out.println();
        System.out.print("Bubble Sort: ");
        printArray(array1);

        int[] array2 = initArray.clone();
        selectionSort(array2);
        System.out.println();
        System.out.print("Selection Sort: ");
        printArray(array2);

        int[] array3 = initArray.clone();
        insertionSort(array3);
        System.out.println();
        System.out.print("Insertion Sort: ");
        printArray(array3);
    }
}
