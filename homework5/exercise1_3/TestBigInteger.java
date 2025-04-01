package homework5.exercise1_3;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        BigInteger sumBigInteger = i1.add(i2);
        BigInteger productBigInteger = i1.multiply(i2);

        System.out.println("Sum: " + sumBigInteger);
        System.out.println("Product: " + productBigInteger);
    }
}
