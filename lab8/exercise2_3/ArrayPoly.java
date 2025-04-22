package lab8.exercise2_3;

import jdk.jfr.Percentage;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        if (degree > degree()) {
            return 0.0;
        }

        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }
}
