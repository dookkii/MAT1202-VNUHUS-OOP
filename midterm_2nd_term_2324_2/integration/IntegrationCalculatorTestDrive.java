package midterm_2nd_term_2324_2.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Viết chương trình test các chức năng của đa thức và các phương pháp tính tích phân.

         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */

        testPolynomial();
        testIntegrationCalculator();
    }

    public static void testPolynomial() {
        /*
         TODO

         - Tạo ra các đá thức kiểu ArrayPolynomial và ListPolynomial.
         - Viết chương trình test các chức năng của đa thức (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         - In kết quả ra terminal mỗi lần thực hiện các chức năng.
         */
        System.out.println("Testing ListPolynomial:");
        ListPolynomial listPoly1 = new ListPolynomial(new double[] {1, 2, 3});
        ListPolynomial listPoly2 = new ListPolynomial(new double[] {4, 5});

        testPolynomialOperations(listPoly1, listPoly2);

        System.out.println("\nTesting ArrayPolynomial:");
        ArrayPolynomial arrayPoly1 = new ArrayPolynomial(new double[] {1, 2, 3});
        ArrayPolynomial arrayPoly2 = new ArrayPolynomial(new double[] {4, 5});

        testPolynomialOperations(arrayPoly1, arrayPoly2);
    }

    private static void testPolynomialOperations(Polynomial poly1, Polynomial poly2) {
        System.out.println("Poly1: " + poly1);
        System.out.println("Poly2: " + poly2);
        System.out.println("Poly1 degree: " + poly1.degree());
        System.out.println("Poly2 degree: " + poly2.degree());

        System.out.println("Poly1 at x=2: " + poly1.evaluate(2));
        System.out.println("Poly2 at x=3: " + poly2.evaluate(3));

        System.out.println("Poly1 derivative: " + poly1.derivative());
        System.out.println("Poly2 derivative: " + poly2.derivative());

        System.out.println("Poly1 + Poly2: " + poly1.plus(poly2));

        System.out.println("Poly1 - Poly2: " + poly1.minus(poly2));

        System.out.println("Poly1 * Poly2: " + poly1.multiply(poly2));

        if (poly1 instanceof ListPolynomial) {
            ListPolynomial listPoly1 = (ListPolynomial) poly1;
            ListPolynomial listPoly2 = (ListPolynomial) poly2;

            System.out.println("Original Poly1 before plusTo: " + listPoly1);
            listPoly1.plusTo(listPoly2);
            System.out.println("Poly1 after plusTo: " + listPoly1);
        } else if (poly1 instanceof ArrayPolynomial) {
            ArrayPolynomial arrayPoly1 = (ArrayPolynomial) poly1;
            ArrayPolynomial arrayPoly2 = (ArrayPolynomial) poly2;

            System.out.println("Original Poly1 before plusTo: " + arrayPoly1);
            arrayPoly1.plusTo(arrayPoly2);
            System.out.println("Poly1 after plusTo: " + arrayPoly1);
        }
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */

        Polynomial poly1 = new ListPolynomial(new double[] {1, 2, 3});
        Polynomial poly2 = new ArrayPolynomial(new double[] {0, 1});
        Polynomial poly3 = new ListPolynomial(new double[] {1, 0, -1});

        Integrator trapezoidRule = new TrapezoidRule(1e-8, 100);
        Integrator midpointRule = new MidpointRule(1e-8, 100);
        Integrator simpsonRule = new SimpsonRule(1e-8, 100);

        System.out.println("Testing with default integrator (TrapezoidRule):");
        IntegrationCalculator calculator1 = new IntegrationCalculator(poly1);
        testIntegration(calculator1, 0, 1);

        System.out.println("Testing with MidpointRule:");
        IntegrationCalculator calculator2 = new IntegrationCalculator(midpointRule, poly2);
        testIntegration(calculator2, 0, 2);

        System.out.println("Testing with SimpsonRule:");
        IntegrationCalculator calculator3 = new IntegrationCalculator(simpsonRule, poly3);
        testIntegration(calculator3, -1, 1);
    }

    private static void testIntegration(IntegrationCalculator calculator, double lower, double upper) {
        System.out.println("Integral from " + lower + " to " + upper + ": " + calculator.integrate(lower, upper));
    }
}
