package exam_2324_2nd_midterm_3.numbersystem;

import java.util.Random;

public class NumberSystemTestDrive {
    private static final String DIGITS = "0123456789ABCDEF";
    private static final Random random = new Random();

    public static void main(String[] args) {
        /* Yêu cầu:

        - Sinh ngẫu nhiên 3 số bằng cách:
            - Cơ số radix là một số tự nhiên nằm trong đoạn [2, 16] được sinh ngẫu nhiên.
            - Xâu ký tự biểu diễn số được sinh ra bằng cách:
                + Độ dài số là một số tự nhiên nằm trong đoạn [10, 30] được sinh ra ngẫu nhiên.
                + Mỗi chữ số được sinh ra bằng cách: sinh ra một chỉ số ngẫu nhiên nằm trong đoạn [0, radix - 1],
                  sau đó lấy tương ứng với chỉ số đó một chữ số nằm trong xâu "0123456789ABCDEF".

        - Mỗi lần sinh ra một số và một cơ số mới, thực hiện việc cập nhật và in ra các số được chuyển đổi
          tự động sang các số được biểu diễn trong hệ cơ số 2, 8, 16.

        - Thực hiện chạy chương trình để in ra terminal thông tin về các số ban đầu và các số chuyển đổi, ví dụ:
          Original number: 123456
          radix 12
          Binary: 1111111
          Octal: 7777777
          Hexadecimal: FFFFFF

          Original number: 456789
          radix 7
          Binary: 1111111
          Octal: 7777777
          Hexadecimal: FFFFFF

          Lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_NumberSystemConverter>.txt (Ví dụ, NguyenVanA_123456_NumberSystemConverter.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_NumberSystemConverter>.zip (Ví dụ, NguyenVanA_123456_NumberSystemConverter.zip),
          nộp lên classroom.
         */

        String[] numbers = {"123456", "456789"};
        int[] radixes = {12, 7};

        for (int i = 0; i < 2; i++) {
            String numberStr = numbers[i];
            int radix = radixes[i];

            OriginalNumber originalNumber = new OriginalNumber(numberStr, radix);

            BinaryConverter binaryConverter = new BinaryConverter(originalNumber);
            OctalConverter octalConverter = new OctalConverter(originalNumber);
            HexadecimalConverter hexadecimalConverter = new HexadecimalConverter(originalNumber);

            System.out.println("Original number: " + originalNumber.getNumberPresentation());
            System.out.println("Radix: " + originalNumber.getRadix());

            binaryConverter.update();
            octalConverter.update();
            hexadecimalConverter.update();

            System.out.println();
        }
    }
}
