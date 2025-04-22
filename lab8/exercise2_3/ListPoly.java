package lab8.exercise2_3;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();

        for (double number : coefficients) {
            this.coefficients.add(number);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        if (degree > degree()) {
            return 0.0;
        }

        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        int n = coefficients.size();
        double[] newCoefficients = new double[n];

        for (int i = 0; i < n; i++) {
            newCoefficients[i] = coefficients.get(i);
        }

        return newCoefficients;
    }
}
