package endterm_2nd_term_2324_2.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        double[] coefficients = coefficients();

        for (int exp = 0; exp <= degree(); exp++) {
            if (coefficients[exp] != 0) {
                if (!result.isEmpty() && coefficients[exp] > 0) {
                    result.append(" + ");
                } else if (coefficients[exp] < 0) {
                    if (exp == 0) {
                        result.append("-");
                    } else {
                        result.append(" - ");
                    }
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

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] polyCoefficients = coefficients();

        int n = polyCoefficients.length - 1;
        double[] newPolyCoefficients = new double[n];

        for (int i = 1; i <= n; i++) {
            newPolyCoefficients[i - 1] = i * polyCoefficients[i];
        }

        return newPolyCoefficients;
    }
}
