package hus.oop.integration;

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
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public Polynomial set(double coefficient, int index);

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

    /**
     * Thêm một phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public Polynomial insertAtStart(double coefficient);

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public Polynomial insertAtEnd(double coefficient);

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public Polynomial insertAtPosition(double coefficient, int index);

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là tổng hai đa thức.
     */
    public Polynomial plus(Polynomial another);

    /**
     * Trừ đa thức hiện tại cho đa thức khác.
     * @param another
     * @return đa thức mới là hiệu hai đa thức.
     */
    public Polynomial minus(Polynomial another);

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là đa thức nhân của hai đa thức.
     */
    public Polynomial multiply(Polynomial another);

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public Polynomial plusTo(Polynomial another);

    /**
     * Trừ đa thức hiện tại cho đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public Polynomial minusFrom(Polynomial another);

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public Polynomial multiplyBy(Polynomial another);
}
