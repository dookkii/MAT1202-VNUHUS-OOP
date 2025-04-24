package exam_2324_2nd_midterm_3.numbersystem;

import java.math.BigInteger;

public class BinaryConverter extends AbstractNumberConverter {
    public BinaryConverter(OriginalNumber originalNumber) {
        super(originalNumber);
    }

    /**
     * Chuyển đổi một số được biểu diễn trong hệ cơ số 10
     * sang số được biểu diễn trong hệ cơ số 2.
     * @param decimal
     * @return xâu ký tự biểu diễn số trong hệ cơ số 2.
     *
     * Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    @Override
    public String decimalTo(String decimal) {
        if (decimal.equals("0")) {
            return "0";
        }

        BigInteger number = new BigInteger(decimal);
        BigInteger two = BigInteger.valueOf(2);

        StringBuilder binary = new StringBuilder();

        while (number.signum() > 0) {
            BigInteger[] tmp = number.divideAndRemainder(two);
            binary.append(tmp[1]);
            number = tmp[0];
        }

        return binary.reverse().toString();
    }

    /**
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi. Sau đó in ra terminal
     * số được chuyển đổi theo định dạng a1a2...an(2).
     */
    @Override
    public void update() {
        this.convert();
        this.display();
    }

    /**
     * Hiển thị số ra terminal theo định dạng a1a2...an(2).
     */
    @Override
    public void display() {
        System.out.println(convertedNumber + "(2)");
    }
}
