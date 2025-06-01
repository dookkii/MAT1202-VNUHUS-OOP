package lab12.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int n = 10;
        double previousResult = integrate(poly, lower, upper, n);

        for (int i = 0; i < maxIterations; i++) {
            n *= 2;

            double currentResult = integrate(poly, lower, upper, n);
            if (Math.abs(currentResult - previousResult) / 3 < precision) {
                return currentResult;
            }
            previousResult = currentResult;
        }
        return previousResult;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double h = (upper - lower) / numOfSubIntervals;
        double sum = poly.evaluate(lower) + poly.evaluate(upper);

        for (int i = 1; i < numOfSubIntervals; i++) {
            double x = lower + i * h;
            if (i % 2 == 0) {
                sum += 2 * poly.evaluate(x);
            } else {
                sum += 4 * poly.evaluate(x);
            }
        }

        return (h / 3) * sum;
    }
}
