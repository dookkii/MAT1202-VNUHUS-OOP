package lab12.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        this.coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        int n = coefficients.size();
        double[] newCoefficients = new double[n];

        for (int i = 0; i < n; i++) {
            newCoefficients[i] = coefficient(i);
        }

        return newCoefficients;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        coefficients.addLast(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        int n = coefficients.size();
        double result = 0;

        for (int i = 0; i < n; i++) {
            result += coefficient(i) * Math.pow(x, i);
        }

        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        ListPolynomial newPolynomial = new ListPolynomial();

        for (double coefficient : differentiate()) {
            newPolynomial.append(coefficient);
        }

        return newPolynomial;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        ArrayList<Double> newCoefficients = new ArrayList<>();

        for (int i = 0; i <= maxDegree; i++) {
            double number1 = (i <= degree()) ? coefficient(i) : 0;
            double number2 = (i <= another.degree()) ? another.coefficient(i) : 0;
            newCoefficients.add(number1 + number2);
        }

        coefficients = newCoefficients;

        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        ArrayList<Double> newCoefficients = new ArrayList<>();

        for (int i = 0; i <= maxDegree; i++) {
            double number1 = (i <= degree()) ? coefficient(i) : 0;
            double number2 = (i <= another.degree()) ? another.coefficient(i) : 0;
            newCoefficients.add(number1 - number2);
        }

        coefficients = newCoefficients;

        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        int newDegree = degree() + another.degree();
        ArrayList<Double> newCoefficients = new ArrayList<>();

        for (int i = 0; i <= newDegree; i++) {
            newCoefficients.add(0.0);
        }

        for (int i = 0; i <= degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                double tmp = coefficient(i) * another.coefficient(j);
                double tmp2 = newCoefficients.get(i + j);
                newCoefficients.set(i + j, tmp + tmp2);
            }
        }

        coefficients = newCoefficients;

        return this;
    }
}
