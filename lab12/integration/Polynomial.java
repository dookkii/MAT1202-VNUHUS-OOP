package lab12.integration;

public interface Polynomial {
    /**
     * Lấy ra hệ số của đa thức tại phần tử index.
     * @return hệ số của đa thức tại phần tử index.
     */
    double coefficient(int index);

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    double[] coefficients();

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    int degree();

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    double evaluate(double x);

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức là đa thức đạo hàm của đa thức ban đầu.
     */
    Polynomial derivative();
}
