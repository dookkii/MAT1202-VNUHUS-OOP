package lab4.classes.exercise1_8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        String result = "";
        for (int exp = getDegree(); exp >= 0; exp--) {
            if (coeffs[exp] != 0) {
                if (!result.isEmpty() && coeffs[exp] > 0) {
                    result += " + ";
                } else if (coeffs[exp] < 0) {
                    result += " - ";
                }
                result += Math.abs(coeffs[exp]);

                if (exp > 0) {
                    result += "x";
                }

                if (exp > 1) {
                    result += "^" + exp;
                }
            }

        }

        return result;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int index = getDegree(); index >= 0; index--) {
            result += coeffs[index] * Math.pow(x, index);
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int exp = 0; exp <= maxDegree; exp++) {
            double num1 = (exp <= getDegree()) ? coeffs[exp] : 0;
            double num2 = (exp <= right.getDegree()) ? right.coeffs[exp] : 0;
            newCoeffs[exp] = num1 + num2;
        }

        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = getDegree() + right.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int exp1 = 0; exp1 <= getDegree(); exp1++) {
            for (int exp2 = 0; exp2 <= right.getDegree(); exp2++) {
                newCoeffs[exp1 + exp2] += coeffs[exp1] * right.coeffs[exp2];
            }
        }

        return new MyPolynomial(newCoeffs);
    }
}
