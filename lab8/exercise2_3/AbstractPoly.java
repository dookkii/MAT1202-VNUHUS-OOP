package lab8.exercise2_3;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        double[] polyCoefficients = coefficients();

        int n = polyCoefficients.length - 1;
        double[] newPolyCoefficients = new double[n];

        for (int i = 1; i <= n; i++) {
            newPolyCoefficients[i - 1] = i * polyCoefficients[i];
        }

        return newPolyCoefficients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        AbstractPoly polynomial = (AbstractPoly) o;

        double[] thisCoefficients = coefficients();
        double[] theOtherCoefficients = polynomial.coefficients();
        if (thisCoefficients.length != theOtherCoefficients.length) {
            return false;
        }

        for (int i = 0; i < thisCoefficients.length; i++) {
            if (thisCoefficients[i] != theOtherCoefficients[i]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        double[] coefficients = coefficients();

        for (int exp = degree(); exp >= 0; exp--) {
            if (coefficients[exp] != 0) {
                if (!result.isEmpty() && coefficients[exp] > 0) {
                    result.append(" + ");
                } else if (coefficients[exp] < 0) {
                    result.append(" - ");
                }
                result.append(Math.abs(coefficients[exp]));

                if (exp > 0) {
                    result.append("x");
                }

                if (exp > 1) {
                    result.append("^").append(exp);
                }
            }
        }

        return result.toString();
    }
}
