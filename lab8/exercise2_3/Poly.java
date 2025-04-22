package lab8.exercise2_3;

public interface Poly {
    int degree();
    Poly derivative();
    double coefficient(int degree);
    double[] coefficients();
}
