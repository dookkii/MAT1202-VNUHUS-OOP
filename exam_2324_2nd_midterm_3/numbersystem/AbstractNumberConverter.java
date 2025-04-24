package exam_2324_2nd_midterm_3.numbersystem;

import java.math.BigInteger;

public abstract class AbstractNumberConverter implements NumberConverter {
    protected OriginalNumber originalNumber;  // Số gốc
    protected String convertedNumber;         // Số được chuyển đổi theo cơ số nào đó từ số gốc

    public AbstractNumberConverter(OriginalNumber originalNumber) {
        this.originalNumber = originalNumber;
        this.originalNumber.addConverter(this);
    }

    /**
     * Chuyển đổi số decimal từ hệ cơ số 10 thành số có hệ cơ số nào đó.
     * @param decimal
     * @return xâu ký tự biểu diễn một số trong hệ cơ số nào đó.
     *
     * Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     *
     * Gợi ý: có thể sử dụng lớp trung gian BigInteger để thuận lợi hơn cho việc tính toán.
     */
    public abstract String decimalTo(String decimal);

    /**
     * Chuyển đổi số được biểu diễn trong originalNumber sang biểu diễn số trong hệ cơ số 10.
     * @return xâu ký tự biểu diễn một số trong hệ cơ số 10.
     *
     * Yêu cầu: sử dụng thuật toán Horner để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    public String toDecimal() {
        String digits = originalNumber.getNumberPresentation();
        int radix = originalNumber.getRadix();

        BigInteger number = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(radix);

        for (int i = digits.length() - 1; i >= 0; i--) {
            number = number.add(base.pow(i).multiply(new BigInteger(String.valueOf(digits.charAt(i)))));
        }

        return number.toString();
    }

    /**
     * Thực hiện chuyển đổi số từ biểu diễn số và hệ cơ số ban đầu trong originalNumber
     * sang số có hệ cơ số nào đó. Kết quả số được chuyển đổi được lưu trong biến 
     * thành viên convertedNumber.
     */
    public void convert() {
        String decimalNumber = this.toDecimal();
        this.convertedNumber = this.decimalTo(decimalNumber);
    }
}
