package endterm_2nd_term_2324_2.matrix;

import java.util.Arrays;
import java.util.Random;

public class MatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Yêu cầu

        Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [5, 10], lưu vào biến n.
        Tạo ra 2 ma trận vuông có cùng kích thước n. Trong đó các phần tử của ma trận được khởi tạo bằng cách sinh ngẫu nhiên
        có giá trị nằm trong đoạn [1, 10].

        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra một ma trận dạng hình thang theo hàng (row echelon form) dùng phép khử Gauss của 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text theo tên <TenSinhVien_MaSinhVien_Matrix.txt>
         (Ví dụ, NguyenVanA_123456_Matrix.txt).
         Nén các file source code và file text kết quả vào file <TenSinhVien_MaSinhVien_Matrix.zip>, nộp lên classroom.
         */

        Random random = new Random();
        random.setSeed(69421);
        int n = random.nextInt(5, 10 + 1);

        SquareMatrix matrix1 = new SquareMatrix(n);
        SquareMatrix matrix2 = new SquareMatrix(n);

        System.out.println("Ma trận vuông 1:");
        System.out.println(matrix1);

        System.out.println("Ma trận vuông 2:");
        System.out.println(matrix2);

        System.out.println("Ma trận 1 chuyển vị:");
        System.out.println(matrix1.transpose());

        System.out.println("Ma trận 2 chuyển vị:");
        System.out.println(matrix2.transpose());

        System.out.println("Đường chéo chính của ma trận 1:");
        System.out.println(Arrays.toString(matrix1.principalDiagonal()));
        System.out.println();

        System.out.println("Đường chéo chính của ma trận 2:");
        System.out.println(Arrays.toString(matrix2.principalDiagonal()));
        System.out.println();

        System.out.println("Đường chéo phụ của ma trận 1:");
        System.out.println(Arrays.toString(matrix1.secondaryDiagonal()));
        System.out.println();

        System.out.println("Đường chéo phụ của ma trận 2:");
        System.out.println(Arrays.toString(matrix2.secondaryDiagonal()));
        System.out.println();

        System.out.println("Tổng của hai ma trận:");
        System.out.println(matrix1.add(matrix2));

        System.out.println("Hiệu của ma trận 1 cho ma trận 2:");
        System.out.println(matrix1.minus(matrix2));

        System.out.println("Tích của hai ma trận:");
        System.out.println(matrix1.multiply(matrix2));

        System.out.println("Ma trận bậc thang của ma trận 1 dùng phép khử Gauss:");
        System.out.println(matrix1.gaussianElimination());

        System.out.println("Ma trận bậc thang của ma trận 2 dùng phép khử Gauss:");
        System.out.println(matrix2.gaussianElimination());
    }
}
