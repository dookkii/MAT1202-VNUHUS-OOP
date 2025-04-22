package midterm_2nd_term_2324_2.integration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial(double[] coefficients) {
        this.coefficients = new ArrayList<>();

        for (double coefficient : coefficients) {
            this.coefficients.add(coefficient);
        }
    }

    public int getSize() {
        return this.coefficients.size();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        if (index >= getSize()) {
            return 0.0;
        }

        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        double[] coefficientArray = new double[getSize()];

        for (int i = 0; i < getSize(); i++) {
            coefficientArray[i] = coefficients.get(i);
        }

        return coefficientArray;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial insertAtStart(double coefficient) {
        coefficients.addFirst(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial insertAtEnd(double coefficient) {
        coefficients.addLast(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insertAtPosition(double coefficient, int index) {
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
        return getSize() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i < coefficients.size(); i++) {
            result += coefficients.get(i) * Math.pow(x, i);
        }

        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public ListPolynomial derivative() {
        if (getSize() == 0) {
            return new ListPolynomial(new double[0]);
        }

        double[] derivativeCoefficients = differentiate();
        return new ListPolynomial(derivativeCoefficients);
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là tổng hai đa thức.
     */
    public ListPolynomial plus(Polynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int exp = 0; exp <= maxDegree; exp++) {
            double number1 = (exp <= degree()) ? coefficients.get(exp) : 0;
            double number2 = (exp <= another.degree()) ? another.coefficients()[exp] : 0;
            newCoefficients[exp] = number1 + number2;
        }

        return new ListPolynomial(newCoefficients);
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plusTo(Polynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int exp = 0; exp <= maxDegree; exp++) {
            double number1 = (exp <= degree()) ? coefficients.get(exp) : 0;
            double number2 = (exp <= another.degree()) ? another.coefficient(exp) : 0;
            newCoefficients[exp] = number1 + number2;
        }

        this.coefficients = new ArrayList<>();

        for (double coefficient : newCoefficients) {
            coefficients.add(coefficient);
        }

        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là hiệu hai đa thức.
     */
    public ListPolynomial minus(Polynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int exp = 0; exp <= maxDegree; exp++) {
            double number1 = (exp <= degree()) ? coefficients.get(exp) : 0;
            double number2 = (exp <= another.degree()) ? another.coefficients()[exp] : 0;
            newCoefficients[exp] = number1 - number2;
        }

        return new ListPolynomial(newCoefficients);
    }

    /**
     * Trừ đa thức hiện tại cho đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minusFrom(Polynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int exp = 0; exp <= maxDegree; exp++) {
            double number1 = (exp <= degree()) ? coefficients.get(exp) : 0;
            double number2 = (exp <= another.degree()) ? another.coefficient(exp) : 0;
            newCoefficients[exp] = number1 - number2;
        }

        this.coefficients = new ArrayList<>();

        for (double coefficient : newCoefficients) {
            coefficients.add(coefficient);
        }

        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là đa thức nhân của hai đa thức.
     */
    public ListPolynomial multiply(Polynomial another) {
        int newDegree = degree() + another.degree();
        double[] newCoefficients = new double[newDegree + 1];

        for (int i = 0; i <= degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                newCoefficients[i + j] += coefficient(i) * another.coefficient(j);
            }
        }

        return new ListPolynomial(newCoefficients);
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiplyBy(Polynomial another) {
        int resultDegree = degree() + another.degree();
        double[] newCoefficients = new double[resultDegree + 1];

        for (int i = 0; i <= degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                newCoefficients[i + j] += coefficient(i) * another.coefficient(j);
            }
        }

        this.coefficients = new ArrayList<>();

        for (double coefficient : newCoefficients) {
            coefficients.add(coefficient);
        }

        return this;
    }
}
