package homework5.exercise1_5;

public class TestMyDate {
    public static void main(String[] args) {
        System.out.println(MyDate.isLeapYear(2000));
        System.out.println(MyDate.isLeapYear(2004));
        System.out.println(MyDate.isLeapYear(1900));
        System.out.println(MyDate.isLeapYear(2001));

        System.out.println(MyDate.isValidDate(2000, 2, 29));
        System.out.println(MyDate.isValidDate(2004, 2, 29));
        System.out.println(MyDate.isValidDate(1900, 2, 29));
        System.out.println(MyDate.isValidDate(2001, 2, 29));
        System.out.println(MyDate.isValidDate(2000, 2, 30));
        System.out.println(MyDate.isValidDate(2000, 13, 1));
        System.out.println(MyDate.isValidDate(2000, 12, 32));

        System.out.println(MyDate.getDayOfWeek(2000, 1, 1));
        System.out.println(MyDate.getDayOfWeek(2000, 2, 29));
        System.out.println(MyDate.getDayOfWeek(2000, 12, 31));
        System.out.println(MyDate.getDayOfWeek(2001, 1, 1));

        MyDate date1 = new MyDate(2012, 2, 28);
        System.out.println(date1);
        System.out.println(date1.nextDay());
        System.out.println(date1.nextDay());
        System.out.println(date1.nextMonth());
        System.out.println(date1.nextYear());

        MyDate date2 = new MyDate(2012, 1, 2);
        System.out.println(date2);
        System.out.println(date2.previousDay());
        System.out.println(date2.previousDay());
        System.out.println(date2.previousMonth());
        System.out.println(date2.previousYear());

        MyDate date3 = new MyDate(2012, 2, 29);
        System.out.println(date3.previousYear());

        // MyDate date4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
        // MyDate date5 = new MyDate(2011, 2, 29); // Invalid year
    }
}
