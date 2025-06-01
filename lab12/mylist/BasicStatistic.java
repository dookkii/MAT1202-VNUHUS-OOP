package lab12.mylist;

public class BasicStatistic {
    private final MyList data;

    private double getNumber(int index) {
        return ((Number) data.get(index)).doubleValue();
    }

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        int n = data.size();
        double maximum = getNumber(0);

        for (int i = 1; i < n; i++) {
            maximum = Math.max(maximum, getNumber(i));
        }

        return maximum;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        int n = data.size();
        double minimum = getNumber(0);

        for (int i = 1; i < n; i++) {
            minimum = Math.min(minimum, getNumber(i));
        }

        return minimum;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        int n = data.size();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += getNumber(i);
        }

        return sum / n;
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        int n = data.size();
        double squareSum = 0;
        double mean_ = mean();

        for (int i = 0; i < n; i++) {
            squareSum += Math.pow(getNumber(i) - mean_, 2);
        }

        return squareSum / n;
    }
}
