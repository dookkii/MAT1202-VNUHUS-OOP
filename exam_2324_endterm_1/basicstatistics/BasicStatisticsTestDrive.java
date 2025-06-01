package exam_2324_endterm_1.basicstatistics;

import java.util.Random;

public class BasicStatisticsTestDrive {
    public static void main(String[] args) {
        /*
           - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
             là <TenSinhVien_MaSinhVien_BasicStatistics>.txt (Ví dụ, NguyenVanA_123456_BasicStatistics.txt).
           - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
             <TenSinhVien_MaSinhVien_BasicStatistics>.zip (Ví dụ, NguyenVanA_123456_BasicStatistics.zip),
             nộp lên classroom.
         */

        testMyArrayList();
        System.out.println();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
           - Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu vào biến length.
           - Tạo một danh sách kiểu MyArrayList có các phần tử dữ liệu kiểu Double, các giá trị của phần
             tử được sinh ngẫu nhiên nằm trong đoạn [1, 20].
           - Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
             In ra các dữ liệu và các đại lượng thống kê.
         */

        MyList arrayList = new MyArrayList();

        Random random = new Random();
        int n = random.nextInt(30, 51);

        for (int i = 1; i <= n; i++) {
            arrayList.append(random.nextDouble(1, 21));
        }

        System.out.println(arrayList);

        BasicStatistic statistic = new BasicStatistic(arrayList);

        System.out.println("Max: " + statistic.max());
        System.out.println("Min: " + statistic.min());
        System.out.println("Mean: " + statistic.mean());
        System.out.println("Variance: " + statistic.variance());
    }

    public static void testMyLinkedList() {
        /*
           - Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [30, 50], lưu vào biến length.
           - Tạo ra một danh sách kiểu MyLinkedList có các phần tử dữ liệu kiểu Double, các giá trị của phần
             tử được sinh ngẫu nhiên nằm trong đoạn [1, 20].
           - Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
             In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */

        MyList linkedList = new MyLinkedList();

        Random random = new Random();
        int n = random.nextInt(30, 51);

        for (int i = 1; i <= n; i++) {
            linkedList.append(random.nextDouble(1, 21));
        }

        System.out.println(linkedList);

        BasicStatistic statistic = new BasicStatistic(linkedList);

        System.out.println("Max: " + statistic.max());
        System.out.println("Min: " + statistic.min());
        System.out.println("Mean: " + statistic.mean());
        System.out.println("Variance: " + statistic.variance());
    }
}
