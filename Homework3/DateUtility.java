package Homework3;

public class DateUtility {
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dev"};
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (!(1 <= year && year <= 9999)) {
            return false;
        }

        if (!(1 <= month && month <= 12)) {
            return false;
        }

        int days;
        if (month == 2 && isLeapYear(year)) {
            days = 29;
        } else {
            days = daysInMonths[month - 1];
        }
        return 1 <= day && day <= days;
    }

    public static String getDayOfWeek(int year, int month, int day) {
        int[] centuryArray = {6, 4, 2, 0};
        int[] monthCodesNonLeap = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] monthCodesLeap = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        String[] weekdays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int centuryNumber = centuryArray[(year / 100) % 4];
        int lastTwoDigitsOfYear = year % 100;
        int lastTwoDigitsOfYearDividedBy4 = lastTwoDigitsOfYear / 4;
        int monthCode;
        if (isLeapYear(year)) {
            monthCode = monthCodesLeap[month - 1];
        } else {
            monthCode = monthCodesNonLeap[month - 1];
        }

        int sum = centuryNumber + lastTwoDigitsOfYear + lastTwoDigitsOfYearDividedBy4 + monthCode + day;

        return weekdays[sum % 7];
    }

    public static String toString(int year, int month, int day) {
        return getDayOfWeek(year, month, day) + " " + day + " " + strMonths[month - 1] + " " + year;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(2012, 2, 14));
    }
}
