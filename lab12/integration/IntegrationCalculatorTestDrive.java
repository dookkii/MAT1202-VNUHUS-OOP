package lab12.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */

        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */

        System.out.println("Testing ArrayPolynomial:");
        ArrayPolynomial poly1 = new ArrayPolynomial();
        ArrayPolynomial poly2 = new ArrayPolynomial();

        poly1.append(123).append(234).append(345);
        poly2.append(456).append(567);
        
        System.out.println("Polynomial 1: " + poly1);
        System.out.println("Polynomial 2: " + poly2);
        System.out.println("Polynomial 1 degree: " + poly1.degree());
        System.out.println("Polynomial 2 degree: " + poly2.degree());

        System.out.println("Polynomial 1 at x = 69: " + poly1.evaluate(69));
        System.out.println("Polynomial 2 at x = 420: " + poly2.evaluate(420));

        System.out.println("Polynomial 1 derivative: " + poly1.derivative());
        System.out.println("Polynomial 2 derivative: " + poly2.derivative());

        System.out.println("Polynomial 1 + Polynomial 2: " + poly1.plus(poly2));

        System.out.println("Polynomial 1 - Polynomial 2: " + poly1.minus(poly2));

        System.out.println("Polynomial 1 * Polynomial 2: " + poly1.multiply(poly2));
    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */

        System.out.println("Testing ListPolynomial:");
        ListPolynomial poly1 = new ListPolynomial();
        ListPolynomial poly2 = new ListPolynomial();

        poly1.append(123).append(234).append(345);
        poly2.append(456).append(567);

        System.out.println("Polynomial 1: " + poly1);
        System.out.println("Polynomial 2: " + poly2);
        System.out.println("Polynomial 1 degree: " + poly1.degree());
        System.out.println("Polynomial 2 degree: " + poly2.degree());

        System.out.println("Polynomial 1 at x = 69: " + poly1.evaluate(69));
        System.out.println("Polynomial 2 at x = 420: " + poly2.evaluate(420));

        System.out.println("Polynomial 1 derivative: " + poly1.derivative());
        System.out.println("Polynomial 2 derivative: " + poly2.derivative());

        System.out.println("Polynomial 1 + Polynomial 2: " + poly1.plus(poly2));

        System.out.println("Polynomial 1 - Polynomial 2: " + poly1.minus(poly2));

        System.out.println("Polynomial 1 * Polynomial 2: " + poly1.multiply(poly2));
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */

        ListPolynomial poly1 = new ListPolynomial();
        poly1.append(12).append(33).append(44);

        ArrayPolynomial poly2 = new ArrayPolynomial();
        poly2.append(2).append(35);

        ListPolynomial poly3 = new ListPolynomial();
        poly1.append(1).append(2).append(-12);

        Integrator trapezoidRule = new TrapezoidRule(1e-8, 100);
        Integrator midpointRule = new MidpointRule(1e-8, 100);
        Integrator simpsonRule = new SimpsonRule(1e-8, 100);

        System.out.println("Testing TrapezoidRule):");
        IntegrationCalculator calculator1 = new IntegrationCalculator(poly1);
        System.out.println("Integral from 0 to 1: " + calculator1.integrate(0, 1));

        System.out.println("Testing MidpointRule:");
        IntegrationCalculator calculator2 = new IntegrationCalculator(midpointRule, poly2);
        System.out.println("Integral from 0 to 2: " + calculator2.integrate(0, 2));

        System.out.println("Testing SimpsonRule:");
        IntegrationCalculator calculator3 = new IntegrationCalculator(simpsonRule, poly3);
        System.out.println("Integral from -1 to 1: " + calculator3.integrate(-1, 1));
    }
}
