package exam_2324_endterm_1.basicstatistics;

public class BasicStatistic {
    private MyList data;

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
        Object max = data.get(0);

        for (int i = 1; i < data.size(); i++) {
            max = Math.max((double) data.get(i), (double) max);
        }

        return (double) max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        Object min = data.get(0);

        for (int i = 1; i < data.size(); i++) {
            min = Math.min((double) data.get(i), (double) min);
        }

        return (double) min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        double sum = 0;

        for (int i = 0; i < data.size(); i++) {
            sum += (double) data.get(i);
        }

        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        double mean = mean();
        double sum = 0;

        for (int i = 0; i < data.size(); i++) {
            sum += Math.pow((double) data.get(i) - mean, 2);
        }

        return sum / data.size();
    }
}
