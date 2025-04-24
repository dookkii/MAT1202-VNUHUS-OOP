package exam_2324_2nd_midterm_3.statistics;

import java.util.Arrays;
import java.util.Random;

public class TestStatistics {
    public static void main(String[] args) {
        /* TODO

         - Viết các hàm test như yêu cầu và chạy test chương trình.
         - Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
          - Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */
        testArrayDataSet();
        testListDataSet();
    }

    public static void testArrayDataSet() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên trong đoạn [10, 20], gọi là n.
         - Sinh ra n số thực kiểu double ngẫu nhiên, cho vào tập dữ liệu
         - In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         - Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
         In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         */

        Random random = new Random();
        int n = random.nextInt(10, 20 + 1);
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextDouble();
        }

        DataSet dataSet = new ArrayDataSet();
        for (double number : array) {
            dataSet.insertAtEnd(number);
        }

        BasicStatistic statistic = new BasicStatistic();
        statistic.setDataSet(dataSet);

        System.out.println(Arrays.toString(statistic.rank()));
        System.out.println(statistic.size());
        System.out.println(statistic.max());
        System.out.println(statistic.min());
        System.out.println(statistic.mean());
        System.out.println(statistic.median());
        System.out.println(statistic.variance());
    }

    public static void testListDataSet() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên trong đoạn [10, 20], gọi là n.
         - Sinh ra n số thực kiểu double ngẫu nhiên, cho vào tập dữ liệu
         - In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         - Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
         In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         */

        Random random = new Random();
        int n = random.nextInt(10, 20 + 1);
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextDouble();
        }

        DataSet dataSet = new ListDataSet();
        for (double number : array) {
            dataSet.insertAtEnd(number);
        }

        BasicStatistic statistic = new BasicStatistic();
        statistic.setDataSet(dataSet);

        System.out.println(Arrays.toString(statistic.rank()));
        System.out.println(statistic.size());
        System.out.println(statistic.max());
        System.out.println(statistic.min());
        System.out.println(statistic.mean());
        System.out.println(statistic.median());
        System.out.println(statistic.variance());
    }
}
