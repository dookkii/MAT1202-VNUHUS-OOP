package lab9_designpatterns.strategy.payment;

public class CreditCardValidator {
    public static boolean isValid(long number) {
        return (
                getSize(number) >= 13
                && getSize(number) <= 16
                && (
                        prefixMatched(number, 4)
                                || prefixMatched(number, 5)
                                || prefixMatched(number, 37)
                                || prefixMatched(number, 6)
                        )
                && ((sumOfDoubleEvenPlace(number)
                + sumOfOddPlace(number)) % 10 == 0)
        );
    }

    public static boolean isValid(String number) {
        return isValid(Long.parseLong(number));
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + " ";

        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }

        return sum;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String num = number + " ";

        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }

        return sum;
    }

    private static int getDigit(int number) {
        if (number < 9) {
            return number;
        }

        return number / 10 + number % 10;
    }

    private static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    private static int getSize(long d) {
        String num = d + "";
        return num.length();
    }

    private static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }

        return number;
    }
}
