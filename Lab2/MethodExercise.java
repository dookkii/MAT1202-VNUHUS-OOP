package Lab2;

import java.util.Scanner;

public class MethodExercise {
    public static int exponent(int base, int exp) {
        if (base == 0) {
            return 0;
        }

        int product = 1;
        for (int i = 1; i <= exp; i++) {
            product *= base;
        }

        return product;
    }

    public static void testExponent(Scanner sc) {
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        System.out.println(base + " raises to the power of " + exponent + " is: " + exponent(base, exponent));
    }

    public static boolean hasEight(int number) {
        String numString = String.valueOf(number);

        for (char character : numString.toCharArray()) {
            if (character == '8') {
                return true;
            }
        }

        return false;
    }

    public static void testMagicSum(Scanner sc) {
        final int SENTINEL = -1;
        int number, sum = 0;

        do {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();

            if (hasEight(number)) {
                sum += number;
            }
        } while (number != SENTINEL);

        System.out.println("The magic sum is: " + sum);
    }

    public static void printArray(int[] array) {
        int length = array.length;

        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print((i == 0) ? array[i] : ", " + array[i]);
        }
        System.out.println("]");
    }

    public static void printArray(double[] array) {
        int length = array.length;

        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print((i == 0) ? array[i] : ", " + array[i]);
        }
        System.out.println("]");
    }

    public static void printArray(float[] array) {
        int length = array.length;

        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print((i == 0) ? array[i] : ", " + array[i]);
        }
        System.out.println("]");
    }

    public static void testPrintArray(Scanner sc) {
        System.out.println("INTEGER");
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS_INT = sc.nextInt();
        System.out.print("Enter the value of all items (separated by space): ");

        int[] arrayInt = new int[NUM_ITEMS_INT];

        for (int index = 0; index < NUM_ITEMS_INT; index++) {
            arrayInt[index] = sc.nextInt();
        }
        printArray(arrayInt);

        System.out.println("DOUBLE");
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS_DOUBLE = sc.nextInt();
        System.out.print("Enter the value of all items (separated by space): ");

        double[] arrayDouble = new double[NUM_ITEMS_DOUBLE];

        for (int index = 0; index < NUM_ITEMS_DOUBLE; index++) {
            arrayDouble[index] = sc.nextDouble();
        }
        printArray(arrayDouble);


        System.out.println("FLOAT");
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS_FLOAT = sc.nextInt();
        System.out.print("Enter the value of all items (separated by space): ");

        float[] arrayFloat = new float[NUM_ITEMS_FLOAT];

        for (int index = 0; index < NUM_ITEMS_FLOAT; index++) {
            arrayFloat[index] = sc.nextFloat();
        }
        printArray(arrayFloat);
    }

    public static String arrayToString(int[] array) {
        int length = array.length;
        String result = "[";

        for (int i = 0; i < length; i++) {
            result += (i == 0) ? array[i] : ", " + array[i];
        }
        result += "]";

        return result;
    }

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

    public static void testArrayToString(Scanner sc) {
        System.out.println(arrayToString(createArray(sc)));
    }

    public static boolean contains(int[] array, int key) {
        for (int number : array) {
            if (number == key) {
                return true;
            }
        }

        return false;
    }

    public static void testContains(Scanner sc) {
        int[] array = createArray(sc);
        System.out.print("Enter the key to check: ");
        int key = sc.nextInt();

        if (contains(array, key)) {
            System.out.println("Contains");
        } else {
            System.out.println("Does not contain");
        }
    }

    public static int search(int[] array, int key) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            if (array[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void testSearch(Scanner sc) {
        int[] array = createArray(sc);
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int searchIndex = search(array, key);
        if (searchIndex == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at " + searchIndex);
        }
    }

    public static boolean equals(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;

        if (length1 != length2) {
            return false;
        }

        for (int i = 0; i < length1; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void testEquals(Scanner sc) {
        int[] array1 = createArray(sc);
        int[] array2 = createArray(sc);

        if (equals(array1, array2)) {
            System.out.println("These two arrays are the same");
        } else {
            System.out.println("These two arrays are not the same");
        }
    }

    public static int[] copyOf(int[] array) {
        int length = array.length;
        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int length = array.length;
        int[] newArray = new int[newLength];

        for (int i = 0; i < newLength; i++) {
            if (i >= length) {
                newArray[i] = 0;
            } else {
                newArray[i] = array[i];
            }
        }

        return newArray;
    }

    public static void testCopy(Scanner sc) {
        int[] array = createArray(sc);
        int[] newArray = copyOf(array);

        System.out.println("New array: " + arrayToString(newArray));

        System.out.print("Enter the new length: ");
        int newLength = sc.nextInt();

        int[] newArrayWithNewLength = copyOf(array, newLength);
        System.out.println("New array with new length: " + arrayToString(newArrayWithNewLength));
    }

    public static boolean swap(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;

        if (length1 != length2) {
            return false;
        }

        for (int i = 0; i < length1; i++) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }

        return true;
    }

    public static void testSwap(Scanner sc) {
        int[] array1 = createArray(sc);
        int[] array2 = createArray(sc);

        boolean check = swap(array1, array2);

        if (check) {
            System.out.println("New array 1: " + arrayToString(array1));
            System.out.println("New array 2: " + arrayToString(array2));
        } else {
            System.out.println("Cannot swap");
        }
    }

    public static void reverse(int[] array) {
        int length = array.length;

        for (int fIdx = 0, bIdx = length - 1; fIdx < bIdx; fIdx++, bIdx--) {
            int tmp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = tmp;
        }
    }

    public static void testReverse(Scanner sc) {
        int[] array = createArray(sc);

        reverse(array);

        System.out.println("New reversed array: " + arrayToString(array));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        testExponent(sc);
        testMagicSum(sc);
        testPrintArray(sc);
        testArrayToString(sc);
        testContains(sc);
        testSearch(sc);
        testEquals(sc);
        testCopy(sc);
        testSwap(sc);
        testReverse(sc);
    }
}
