package lab12.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double[] coeffs = coefficients();

        for (int i = 0; i < coeffs.length; i++) {
            double coeff = coeffs[i];

            if (coeff == 0) {
                continue;
            }

            if (coeffs[i] < 0) {
                if (i == 0) {
                    sb.append("-");
                } else {
                    sb.append(" - ");
                }
            } else {
                if (i != 0) {
                    sb.append(" + ");
                }
            }

            sb.append(Math.abs(coeff));

            if (i == 1) {
                sb.append("x");
            } else if (i > 1) {
                sb.append("x^").append(i);
            }
        }

        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] coeffs = coefficients();
        int n = coeffs.length;
        double[] derivativeCoeffs = new double[n - 1];

        for (int i = 1; i < n; i++) {
            derivativeCoeffs[i - 1] = coeffs[i] * i;
        }

        return derivativeCoeffs;
    }
}
