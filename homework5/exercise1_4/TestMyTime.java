package homework5.exercise1_4;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime tmp;
        MyTime t1 = new MyTime();
        System.out.println(t1);

        MyTime t2 = new MyTime(23, 59, 59);
        System.out.println(t2);

        tmp = t2.nextSecond();
        System.out.println(tmp);

        tmp = t2.previousSecond();
        System.out.println(tmp);

        t1.setTime(12, 30, 45);
        System.out.println(t1);

        tmp = t1.nextMinute();
        System.out.println(tmp);

        tmp = t1.nextHour();
        System.out.println(tmp);

        tmp = t1.previousMinute();
        System.out.println(tmp);

        tmp = t1.previousHour();
        System.out.println(tmp);

        t1.setHour(5);
        t1.setMinute(15);
        t1.setSecond(20);
        System.out.println(t1.getHour() + " :: " + t1.getMinute() + " :: " + t1.getSecond());
    }
}
