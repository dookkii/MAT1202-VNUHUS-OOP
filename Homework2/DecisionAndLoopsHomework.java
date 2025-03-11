package Homework2;

import java.util.Scanner;

public class DecisionAndLoopsHomework {
    public static Scanner scanner;

    public static void guessNumber() {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        guessNumber(SECRET_NUMBER, scanner);
    }

    public static void guessNumber(int number, Scanner sc) {
        int count = 0;

        System.out.print("Key in your guess: ");
        while (true) {
            count++;

            int inputNumber = sc.nextInt();
            if (inputNumber > number) {
                System.out.println("Try lower");
            } else if (inputNumber < number) {
                System.out.println("Try higher");
            } else {
                System.out.println("You got it in " + count + " trials!");
                break;
            }
        }
    }

    public static void guessWord() {
        final String word = "skibidi";
        guessWord(word, scanner);
    }

    public static void guessWord(String guessedString, Scanner sc) {
        int count = 0;
        int guessedStringLength = guessedString.length();
        char[] charArray = guessedString.toCharArray();
        boolean[] check = new boolean[guessedStringLength];

        System.out.print("Key in one character or your guess word: ");
        while (true) {
            count++;

            String inputString = sc.nextLine();
            if (inputString.length() == 1) {
                char character = inputString.charAt(0);

                for (int i = 0; i < guessedStringLength; i++) {
                    if (charArray[i] == character) {
                        check[i] = true;
                    }
                }

                System.out.print("Trial " + count + ": ");
                for (int i = 0; i < guessedStringLength; i++) {
                    if (check[i]) {
                        System.out.print(charArray[i]);
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            } else {
                System.out.println("Congratulations!");
                System.out.println("You got it in " + count + " trials!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Guess the number");
        guessNumber();

        System.out.println("Guess the word");
        guessWord();
    }
}
