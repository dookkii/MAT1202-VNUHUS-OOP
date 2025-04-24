package exam_2324_2nd_midterm_3.numbersystem;

import java.math.BigInteger;

public class HexadecimalConverter extends AbstractNumberConverter {
    public HexadecimalConverter(OriginalNumber originalNumber) {
        super(originalNumber);
    }

    /**
     * Chuyển đổi một số được biểu diễn trong hệ cơ số 10
     * sang số được biểu diễn trong hệ cơ số 16.
     * @param decimal
     * @return xâu ký tự biểu diễn số trong hệ cơ số 16.
     *
     * Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    @Override
    public String decimalTo(String decimal) {
        String HEX_DIGITS = "0123456789ABCDEF";

        if (decimal.equals("0")) {
            return "0";
        }

        BigInteger number = new BigInteger(decimal);
        BigInteger sixteen = BigInteger.valueOf(16);

        StringBuilder hex = new StringBuilder();

        while (number.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] numberDivideAndRemainder = number.divideAndRemainder(sixteen);
            int remainder = numberDivideAndRemainder[1].intValue();
            hex.insert(0, HEX_DIGITS.charAt(remainder));
            number = numberDivideAndRemainder[0];
        }

        return hex.toString();
    }

    /**
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi. Sau đó in ra terminal 
     * số được chuyển đổi theo định dạng a1a2...an(16).
     */
    @Override
    public void update() {
        this.convert();
        this.display();
    }

    /**
     * Hiển thị số ra terminal theo định dạng a1a2...an(16).
     */
    @Override
    public void display() {
        System.out.println(convertedNumber + "(16)");
    }
}
