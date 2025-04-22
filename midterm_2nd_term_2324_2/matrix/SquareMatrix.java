package midterm_2nd_term_2324_2.matrix;

public class SquareMatrix extends Matrix {
    private int size;
    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong đoạn [1, 10]
     * @param size
     */
    public SquareMatrix(int size) {
        super(size, size);
        this.size = size;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     * @return đường chéo chính của ma trận.
     */
    public double[] principalDiagonal() {
        double[] diagonal = new double[size];

        for (int i = 0; i < size; i++) {
            diagonal[i] = this.get(i, i);
        }

        return diagonal;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     * @return đường chéo phụ của ma trận.
     */
    public double[] secondaryDiagonal() {
        double[] diagonal = new double[size];

        for (int i = 0; i < size; i++) {
            diagonal[i] = this.get(size - 1 - i, size - 1 - i);
        }

        return diagonal;
    }
}
