package homework5.exercise1_4;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        if (!(
            (0 <= hour && hour <= 23) &&
            (0 <= minute && minute <= 59) &&
            (0 <= second && second <= 59)
        )) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (!(0 <= hour && hour <= 23)) {
            throw new IllegalArgumentException("Invalid hour!");
        }

        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (!(0 <= minute && minute <= 59)) {
            throw new IllegalArgumentException("Invalid minute!");
        }

        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (!(0 <= second && second <= 59)) {
            throw new IllegalArgumentException("Invalid second!");
        }

        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (second == 59) {
            setSecond(0);
            return nextMinute();
        }

        second += 1;
        return this;
    }

    public MyTime nextMinute() {
        if (minute == 59) {
            setMinute(0);
            return nextHour();
        }

        minute += 1;
        return this;
    }

    public MyTime nextHour() {
        if (hour == 23) {
            setHour(0);
        } else {
            hour += 1;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second == 0) {
            setSecond(59);
            return previousMinute();
        }

        second -= 1;
        return this;
    }

    public MyTime previousMinute() {
        if (minute == 0) {
            setMinute(59);
            return previousHour();
        }

        minute -= 1;
        return this;
    }

    public MyTime previousHour() {
        if (hour == 0) {
            setHour(23);
        } else {
            hour -= 1;
        }
        return this;
    }
}
