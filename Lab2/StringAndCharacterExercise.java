package Lab2;

import java.util.Scanner;

public class StringAndCharacterExercise {
    public static String reverseString(String inStr) {
        int length = inStr.length();
        String result = "";

        for (int index = length - 1; index >= 0; index--) {
            result += inStr.charAt(index);
        }

        return result;
    }

    public static void testReverseString(Scanner sc) {
        System.out.print("Enter a string: ");
        String string = sc.next();

        System.out.println(reverseString(string));
    }

    public static int countVowels(String inStr) {
        int length = inStr.length();
        int vowelCounter = 0;

        for (int index = 0; index < length; index++) {
            char characterAtIndex = inStr.charAt(index);
            if (characterAtIndex == 'a' || characterAtIndex == 'e' || characterAtIndex == 'i' || characterAtIndex == 'o' || characterAtIndex == 'u') {
                vowelCounter++;
            }
        }

        return vowelCounter;
    }

    public static int countDigits(String inStr) {
        int length = inStr.length();
        int digitCounter = 0;

        for (int index = 0; index < length; index++) {
            char characterAtIndex = inStr.charAt(index);
            if (Character.isDigit(characterAtIndex)) {
                digitCounter++;
            }
        }

        return digitCounter;
    }

    public static void testCountVowelsDigits(Scanner sc) {
        System.out.print("Enter a string: ");
        String string = sc.next().toLowerCase();

        int length = string.length();
        int numberOfVowels = countVowels(string);
        int numberOfDigits = countDigits(string);

        System.out.printf("Number of vowels: %d (%.2f%%)\n", numberOfVowels, (double) numberOfVowels / length * 100);
        System.out.printf("Number of digits: %d (%.2f%%)\n", numberOfDigits, (double) numberOfDigits / length * 100);
    }

    public static String phoneKeyPad(String inStr) {
        int length = inStr.length();
        String result = "";

        for (int index = 0; index < length; index++) {
            char characterAtIndex = inStr.charAt(index);
            int mappedDigit;

            switch (characterAtIndex) {
                case 'a':
                case 'b':
                case 'c':
                    mappedDigit = 2;
                    break;
                case 'd':
                case 'e':
                case 'f':
                    mappedDigit = 3;
                    break;
                case 'g':
                case 'h':
                case 'i':
                    mappedDigit = 4;
                    break;
                case 'j':
                case 'k':
                case 'l':
                    mappedDigit = 5;
                    break;
                case 'm':
                case 'n':
                case 'o':
                    mappedDigit = 6;
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    mappedDigit = 7;
                    break;
                case 't':
                case 'u':
                case 'v':
                    mappedDigit = 8;
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    mappedDigit = 9;
                    break;
                default:
                    mappedDigit = 0;
            }

            result += String.valueOf(mappedDigit);
        }

        return result;
    }

    public static void testPhoneKeyPad(Scanner sc) {
        System.out.print("Enter a string: ");
        String string = sc.next().toLowerCase();

        System.out.println(phoneKeyPad(string));
    }

    public static String cipherCaesarCode(String inStr) {
        int length = inStr.length();
        String result = "";

        for (int index = 0; index < length; index++) {
            char characterAtIndex = inStr.charAt(index);

            if ('X' <= characterAtIndex && characterAtIndex <= 'Z') {
                characterAtIndex -= 26;
            }

            characterAtIndex += 3;

            result += characterAtIndex;
        }

        return result;
    }

    public static void testCipherCaesarCode(Scanner sc) {
        System.out.print("Enter a plaintext string: ");
        String string = sc.next().toUpperCase();

        System.out.println("The ciphertext string is: " + cipherCaesarCode(string));
    }

    public static String decipherCaesarCode(String inStr) {
        int length = inStr.length();
        String result = "";

        for (int index = 0; index < length; index++) {
            char characterAtIndex = inStr.charAt(index);

            if ('A' <= characterAtIndex && characterAtIndex <= 'B') {
                characterAtIndex += 26;
            }

            characterAtIndex -= 3;

            result += characterAtIndex;
        }

        return result;
    }

    public static void testDecipherCaesarCode(Scanner sc) {
        System.out.print("Enter a ciphertext string: ");
        String string = sc.next().toUpperCase();

        System.out.println("The plaintext string is: " + decipherCaesarCode(string));
    }

    public static boolean isHexString(String hexStr) {
        int length = hexStr.length();

        for (int index = 0; index < length; index++) {
            char characterAtIndex = hexStr.charAt(index);

            if (!(('0' <= characterAtIndex && characterAtIndex <= '9')
                || ('A' <= characterAtIndex && characterAtIndex <= 'Z')
                || ('a' <= characterAtIndex && characterAtIndex <= 'z'))) {
                return false;
            }
        }

        return true;
    }

    public static void testHexString(Scanner sc) {
        String hexStr = sc.next();

        if (isHexString(hexStr)) {
            System.out.println("\"" + hexStr + "\" is a Hex string");
        } else {
            System.out.println("\"" + hexStr + "\" is not a Hex string");
        }
    }

    public static boolean isBinString(String binStr) {
        int length = binStr.length();

        for (int index = 0; index < length; index++) {
            char characterAtIndex = binStr.charAt(index);

            if (characterAtIndex != '0' && characterAtIndex != '1') {
                return false;
            }
        }

        return true;
    }

    public static int binaryToDecimal(String binStr) {
        int length = binStr.length();
        int result = 0;

        for (int index = 0; index < length; index++) {
            char characterAtIndex = binStr.charAt(index);

            if (characterAtIndex == '1') {
                result += (int) Math.pow(2, length - index - 1);
            }
        }

        return result;
    }

    public static void testBinaryToDecimal(Scanner sc) {
        System.out.print("Enter a Binary string: ");
        String binStr = sc.next();

        if (isBinString(binStr)) {
            System.out.println("The equivalent decimal number for binary \"" + binStr + "\" is: " + binaryToDecimal(binStr));
        } else {
            System.err.println("invalid binary string \"" + binStr + "\"");
        }
    }

    public static int hexadecimalToDecimal(String hexStr) {
        int length = hexStr.length();
        int result = 0;

        for (int index = 0; index < length; index++) {
            char characterAtIndex = hexStr.charAt(index);

            int mappedNumber;
            switch (characterAtIndex) {
                case 'a':
                    mappedNumber = 10;
                    break;
                case 'b':
                    mappedNumber = 11;
                    break;
                case 'c':
                    mappedNumber = 12;
                    break;
                case 'd':
                    mappedNumber = 13;
                    break;
                case 'e':
                    mappedNumber = 14;
                    break;
                case 'f':
                    mappedNumber = 15;
                    break;
                default:
                    mappedNumber = characterAtIndex - '0';
            }

            result += mappedNumber * (int) Math.pow(16, length - index - 1);
        }

        return result;
    }

    public static void testHexadecimalToDecimal(Scanner sc) {
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = sc.next().toLowerCase();

        if (isHexString(hexStr)) {
            System.out.println("The equivalent decimal number for hexadecimal \"" + hexStr + "\" is: " + binaryToDecimal(hexStr));
        } else {
            System.err.println("invalid hexadecimal string \"" + hexStr + "\"");
        }
    }

    public static int octalToDecimal(String octalStr) {
        int length = octalStr.length();
        int result = 0;

        for (int index = 0; index < length; index++) {
            char characterAtIndex = octalStr.charAt(index);

            int number = characterAtIndex - '0';
            result += number * (int) Math.pow(8, length - index - 1);
        }

        return result;
    }

    public static boolean isOctalString(String octalStr) {
        int length = octalStr.length();

        for (int index = 0; index < length; index++) {
            char characterAtIndex = octalStr.charAt(index);

            if (!('0' <= characterAtIndex && characterAtIndex <= '8')) {
                return false;
            }
        }

        return true;
    }

    public static void testOctalToDecimal(Scanner sc) {
        System.out.print("Enter a Octal string: ");
        String octalStr = sc.next();

        if (isOctalString(octalStr)) {
            System.out.println("The equivalent decimal number for octal \"" + octalStr + "\" is: " + octalToDecimal(octalStr));
        } else {
            System.err.println("invalid octal string \"" + octalStr + "\"");
        }
    }

    public static int radixNToDecimal(int radix, String radixNStr) {
        int result = 0;
        int length = radixNStr.length();

        for (int i = 0; i < length; i++) {
            char character = radixNStr.charAt(i);
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

            result += number * (int) Math.pow(radix, length - i - 1);
        }

        return result;
    }

    public static void testRadixNToDecimal(Scanner sc) {
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();
        System.out.print("Enter the string: ");
        String string = sc.next();

        System.out.println("the equivalent decimal number \"" + string + "\" is: " + radixNToDecimal(radix, string));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        testReverseString(sc);
        testCountVowelsDigits(sc);
        testPhoneKeyPad(sc);
        testCipherCaesarCode(sc);
        testDecipherCaesarCode(sc);
        testHexString(sc);
        testBinaryToDecimal(sc);
        testHexadecimalToDecimal(sc);
        testOctalToDecimal(sc);
        testRadixNToDecimal(sc);
    }
}
