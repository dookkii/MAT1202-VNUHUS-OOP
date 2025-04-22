package endterm_2nd_term_2324_2.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficients;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial(double[] coefficients) {
        this.coefficients = coefficients;
        this.size = coefficients.length;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        if (index > degree()) {
            return 0.0;
        }

        return coefficients[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        return coefficients;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insertAtStart(double coefficient) {
        enlarge();
        for (int i = 0; i < size - 1; i++) {
            coefficients[i + 1] = coefficients[i];
        }
        coefficients[0] = coefficient;

        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insertAtEnd(double coefficient) {
        enlarge();
        coefficients[size - 1] = coefficient;

        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insertAtPosition(double coefficient, int index) {
        enlarge();
        for (int i = index; i < size - 1; i++) {
            coefficients[i + 1] = coefficients[i];
        }
        coefficients[index] = coefficient;

        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int index = 0; index < size; index++) {
            result += coefficients[index] * Math.pow(x, index);
        }

        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public ArrayPolynomial derivative() {
        if (size == 0) {
            return new ArrayPolynomial(new double[0]);
        }

        double[] derivativeCoefficients = differentiate();
        return new ArrayPolynomial(derivativeCoefficients);
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức mới là tổng hai đa thức.
     */
    public ArrayPolynomial plus(Polynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int exp = 0; exp <= maxDegree; exp++) {
            double number1 = (exp <= degree()) ? coefficients[exp] : 0;
            double number2 = (exp <= another.degree()) ? another.coefficients()[exp] : 0;
            newCoefficients[exp] = number1 + number2;
        }

        return new ArrayPolynomial(newCoefficients);
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plusTo(Polynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int exp = 0; exp <= maxDegree; exp++) {
            double number1 = (exp <= degree()) ? coefficients[exp] : 0;
            double number2 = (exp <= another.degree()) ? another.coefficient(exp) : 0;
            newCoefficients[exp] = number1 + number2;
        }

        this.coefficients = newCoefficients;
        this.size = newCoefficients.length;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là hiệu hai đa thức.
     */
    public ArrayPolynomial minus(Polynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int exp = 0; exp <= maxDegree; exp++) {
            double number1 = (exp <= degree()) ? coefficients[exp] : 0;
            double number2 = (exp <= another.degree()) ? another.coefficients()[exp] : 0;
            newCoefficients[exp] = number1 - number2;
        }

        return new ArrayPolynomial(newCoefficients);
    }

    /**
     * Trừ đa thức hiện tại cho đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minusFrom(Polynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int exp = 0; exp <= maxDegree; exp++) {
            double number1 = (exp <= degree()) ? coefficients[exp] : 0;
            double number2 = (exp <= another.degree()) ? another.coefficient(exp) : 0;
            newCoefficients[exp] = number1 - number2;
        }

        this.coefficients = newCoefficients;
        this.size = newCoefficients.length;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là đa thức nhân của hai đa thức.
     */
    public ArrayPolynomial multiply(Polynomial another) {
        int newDegree = degree() + another.degree();
        double[] newCoefficients = new double[newDegree + 1];

        for (int i = 0; i <= degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                newCoefficients[i + j] += coefficient(i) * another.coefficient(j);
            }
        }

        return new ArrayPolynomial(newCoefficients);
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiplyBy(Polynomial another) {
        int resultDegree = degree() + another.degree();
        double[] newCoefficients = new double[resultDegree + 1];

        for (int i = 0; i <= degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                newCoefficients[i + j] += coefficient(i) * another.coefficient(j);
            }
        }

        this.coefficients = newCoefficients;
        this.size = newCoefficients.length;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        double[] newCoefficients = new double[size + 1];
        System.arraycopy(coefficients, 0, newCoefficients, 0, coefficients.length);

        size++;
        coefficients = newCoefficients;
    }
}
