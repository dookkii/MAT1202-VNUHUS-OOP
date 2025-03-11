package Homework2;

import java.util.Scanner;

public class StringAndCharacterHomework {
    public static Scanner scanner;

    public static String exchangeCipher(String inStr) {
        char[] charArray = inStr.toCharArray();
        String resultString = "";

        for (char character : charArray) {
            resultString += Character.toString((char) ('Z' - character + 'A'));
        }

        return resultString;
    }

    public static void testExchangeCipher() {
        System.out.print("Enter a plaintext string: ");
        String inputString = scanner.next();
        System.out.println("The ciphertext string is: " + exchangeCipher(inputString.toUpperCase()));
    }

    public static boolean isPalindromicWord(String inStr) {
        int strLength = inStr.length();
        int frontIndex = 0;
        int backIndex = strLength - 1;

        while (frontIndex < backIndex) {
            if (inStr.charAt(frontIndex) != inStr.charAt(backIndex)) {
                return false;
            }

            frontIndex++;
            backIndex--;
        }

        return true;
    }

    public static void testPalindromicWord() {
        System.out.print("Enter a plaintext string: ");
        String inputString = scanner.next();

        if (isPalindromicWord(inputString)) {
            System.out.println("'" + inputString + "' is a palindromic string.");
        } else {
            System.out.println("'" + inputString + "' is not a palindromic string.");
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        testExchangeCipher();
        testPalindromicWord();
    }
}
