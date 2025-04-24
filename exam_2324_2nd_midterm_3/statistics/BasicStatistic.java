package exam_2324_2nd_midterm_3.statistics;

import java.util.Arrays;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
        dataSet = new ArrayDataSet();
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        return dataSet.size();
    }

    @Override
    public double max() {
        double maximum = -Double.MAX_VALUE;
        for (double number : dataSet.dataArray()) {
            maximum = Math.max(maximum, number);
        }
        return maximum;
    }

    @Override
    public double min() {
        double minimum = Double.MAX_VALUE;
        for (double number : dataSet.dataArray()) {
            minimum = Math.min(minimum, number);
        }
        return minimum;
    }

    @Override
    public double mean() {
        int n = size();
        double sum = 0;
        for (double number : dataSet.dataArray()) {
            sum += number;
        }
        return sum / n;
    }

    @Override
    public double variance() {
        int n = size();
        double squareSum = 0;
        for (double number : dataSet.dataArray()) {
            squareSum += Math.pow(number - mean(), 2);
        }
        return squareSum / n;
    }

    @Override
    public double[] rank() {
        double[] data = dataSet.dataArray();
        double[] ranks = new double[data.length];

        int[] indices = new int[data.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices);

        for (int rank = 0; rank < indices.length; rank++) {
            ranks[indices[rank]] = rank + 1;
        }

        return ranks;
    }

    @Override
    public double median() {
        int n = size();

        double[] data = dataSet.dataArray().clone();
        Arrays.sort(data);

        if (n % 2 == 1) {
            return data[n / 2];
        } else {
            return (data[n / 2 - 1] + data[n / 2]) / 2;
        }
    }
}
