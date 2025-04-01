package homework5.exercise1_5;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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
            days = DAYS_IN_MONTHS[month - 1];
        }
        return 1 <= day && day <= days;
    }

    public static String getDayOfWeek(int year, int month, int day) {
        int[] centuryArray = {6, 4, 2, 0};
        int[] monthCodesNonLeap = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] monthCodesLeap = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

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

        return DAYS[sum % 7];
    }

    public MyDate(int year, int month, int day) {
        if (!(
                (1 <= year && year <= 9999) &&
                (1 <= month && month <= 12)
        )) {
            int daysInMonth = DAYS_IN_MONTHS[month - 1];

            if (month == 2 && isLeapYear(year)) {
                daysInMonth = 29;
            }

            if (!(0 <= day && day <= daysInMonth)) {
                throw new IllegalArgumentException("Invalid year, month, or day!");
            }
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (!(1 <= year && year <= 9999)) {
            throw new IllegalArgumentException("Invalid year!");
        }

        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (!(1 <= month && month <= 12)) {
            throw new IllegalArgumentException("Invalid month!");
        }

        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int daysInMonth = DAYS_IN_MONTHS[month - 1];

        if (month == 2 && isLeapYear(year)) {
            daysInMonth = 29;
        }

        if (!(0 <= day && day <= daysInMonth)) {
            throw new IllegalArgumentException("Invalid day!");
        }

        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public String toString() {
        return getDayOfWeek(year, month, day) + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        int maxDay;
        maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }

        if (day == maxDay) {
            setDay(1);
            return nextMonth();
        }

        setDay(day + 1);
        return this;
    }

    public MyDate nextMonth() {
        int nextMonth = (month == 12) ? 1 : month + 1;
        int maxDayOfNextMonth;
        if (nextMonth == 2 && isLeapYear(year)) {
            maxDayOfNextMonth = 29;
        } else {
            maxDayOfNextMonth = DAYS_IN_MONTHS[nextMonth - 1];
        }

        if (day > maxDayOfNextMonth) {
            setDay(maxDayOfNextMonth);
        }

        setMonth(nextMonth);

        if (nextMonth == 1) {
            return nextYear();
        }

        return this;
    }

    public MyDate nextYear() {
        if (year + 1 > 9999) {
            throw new IllegalStateException("Year out of range!");
        }

        year += 1;

        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }

        return this;
    }


    public MyDate previousDay() {
        int maxDayOfPreviousMonth;
        if (month == 1) {
            maxDayOfPreviousMonth = DAYS_IN_MONTHS[11];
        } else if (month == 3 && isLeapYear(year)) {
            maxDayOfPreviousMonth = 29;
        } else {
            maxDayOfPreviousMonth = DAYS_IN_MONTHS[month - 1];
        }

        if (day == 1) {
            setDay(maxDayOfPreviousMonth);
            return previousMonth();
        }

        day -= 1;
        return this;
    }

    public MyDate previousMonth() {
        int previousMonth = (month == 1) ? 12 : month - 1;
        int maxDayOfPreviousMonth;
        if (previousMonth == 2 && isLeapYear(year)) {
            maxDayOfPreviousMonth = 29;
        } else {
            maxDayOfPreviousMonth = DAYS_IN_MONTHS[previousMonth - 1];
        }

        if (day > maxDayOfPreviousMonth) {
            day = maxDayOfPreviousMonth;
        }

        if (previousMonth == 12) {
            setMonth(previousMonth);
            return previousYear();
        }

        month -= 1;
        return this;
    }

    public MyDate previousYear() {
        if (year - 1 < 1) {
            throw new IllegalStateException("Year out of range!");
        }

        setYear(year - 1);

        if (month == 2 && day == 29 && !isLeapYear(year)) {
            setDay(28);
        }

        return this;
    }
}
