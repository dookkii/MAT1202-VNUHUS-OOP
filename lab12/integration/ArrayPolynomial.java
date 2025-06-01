package lab12.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficients;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        this.size = 0;
        this.coefficients = new double[DEFAULT_CAPACITY];
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
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
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        insert(coefficient, size);
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (size >= coefficients.length) {
            enlarge();
        }

        for (int i = index; i < size - 1; i++) {
            coefficients[i + 1] = coefficients[i];
        }

        coefficients[index] = coefficient;
        size++;

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

        for (int index = 0; index <= degree(); index++) {
            result += coefficients[index] * Math.pow(x, index);
        }

        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        ArrayPolynomial newPolynomial = new ArrayPolynomial();

        for (double coefficient : differentiate()) {
            newPolynomial.append(coefficient);
        }

        return newPolynomial;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double number1 = (i <= degree()) ? coefficient(i) : 0;
            double number2 = (i <= another.degree()) ? another.coefficient(i) : 0;
            newCoefficients[i] = number1 + number2;
        }

        coefficients = newCoefficients;

        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        int maxDegree = Math.max(degree(), another.degree());
        double[] newCoefficients = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double number1 = (i <= degree()) ? coefficient(i) : 0;
            double number2 = (i <= another.degree()) ? another.coefficient(i) : 0;
            newCoefficients[i] = number1 - number2;
        }

        coefficients = newCoefficients;

        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        int newDegree = degree() + another.degree();
        double[] newCoefficients = new double[newDegree + 1];

        for (int i = 0; i <= degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                double tmp = coefficient(i) * another.coefficient(j);
                double tmp2 = newCoefficients[i + j];
                newCoefficients[i + j] = tmp + tmp2;
            }
        }

        coefficients = newCoefficients;

        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        double[] newData = new double[size * 2];
        System.arraycopy(coefficients, 0, newData, 0, size);

        coefficients = newData;
    }
}
