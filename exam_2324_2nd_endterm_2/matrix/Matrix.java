package exam_2324_2nd_endterm_2.matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private double[][] data;

    private final int rows;
    private final int columns;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong đoạn [1, 10]
     * @param rows số hàng, columns số cột
     */
    public Matrix(int rows, int columns) {
        data = new double[rows][columns];
        this.rows = rows;
        this.columns = columns;

        initRandom(rows, columns);
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong đoạn [1, 10]
     * @param rows số hàng, columns số cột
     */
    private void initRandom(int rows, int columns) {
        Random random = new Random();
        double MIN_VALUE = 1;
        double MAX_VALUE = 10;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                data[row][column] = MIN_VALUE + (MAX_VALUE - MIN_VALUE) * random.nextDouble();
            }
        }
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     * @param row
     * @param col
     * @return
     */
    public double get(int row, int col) {
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, double value) {
        data[row][col] = value;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public Matrix getSortedMatrix() {
        double[] numbers = new double[rows * columns];
        int index = 0;
        for (double[] row : data) {
            for (double number : row) {
                numbers[index++] = number;
            }
        }

        Arrays.sort(numbers);

        Matrix sortedMatrix = new Matrix(rows, columns);
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sortedMatrix.set(i, j, numbers[index++]);
            }
        }

        return sortedMatrix;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public Matrix add(Matrix that) {
        if (rows != that.data.length || columns != that.data[0].length) {
            return null;
        }

        Matrix newMatrix = new Matrix(rows, columns);

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                newMatrix.set(row, column, this.get(row, column) + that.get(row, column));
            }
        }

        return newMatrix;
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public Matrix minus(Matrix that) {
        if (rows != that.data.length || columns != that.data[0].length) {
            return null;
        }

        Matrix newMatrix = new Matrix(rows, columns);

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                newMatrix.set(row, column, this.get(row, column) - that.get(row, column));
            }
        }

        return newMatrix;
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận nhân của hai ma trận.
     */
    public Matrix multiply(Matrix that) {
        int rows1 = rows;
        int columns1 = columns;
        int rows2 = that.data.length;
        int columns2 = that.data[0].length;

        if (columns1 != rows2) {
            return null;
        }

        Matrix newMatrix = new Matrix(rows1, columns2);

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < rows2; k++) {
                    newMatrix.data[i][j] = this.get(i, k) * that.get(k, j);
                }
            }
        }

        return newMatrix;
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public Matrix scaled(int value) {
        Matrix newMatrix = new Matrix(rows, columns);

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                newMatrix.set(row, column, this.get(row, column) * value);
            }
        }

        return newMatrix;
    }

    /**
     * Phương thức nhân hàng thứ rowIndex của ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận có hàng rowIndex bằng hàng rowIndex của ma trận hiện tại nhân với một số vô hướng.
     */
    public Matrix scaledRow(int value, int rowIndex) {
        Matrix newMatrix = new Matrix(rows, columns);

        for (int column = 0; column < columns; column++) {
            newMatrix.set(rowIndex, column, this.get(rowIndex, column) * value);
        }

        return newMatrix;
    }

    /**
     * Phương thức nhân cột thứ columnIndex của ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận có cột columnIndex bằng cột columnIndex của ma trận hiện tại nhân với một số vô hướng.
     */
    public Matrix scaledColumn(int value, int columnIndex) {
        Matrix newMatrix = new Matrix(rows, columns);

        for (int row = 0; row < rows; row++) {
            newMatrix.set(row, columnIndex, this.get(row, columnIndex) * value);
        }

        return newMatrix;
    }

    /**
     * Phương thức hoán đổi hai hàng của ma trận.
     * @param firstIndex
     * @param secondIndex
     */
    public void swapRows(int firstIndex, int secondIndex) {
        for (int column = 0; column < columns; column++) {
            double tmp = this.get(firstIndex, column);
            this.set(firstIndex, column, this.get(secondIndex, column));
            this.set(secondIndex, column, tmp);
        }
    }

    /**
     * Phương thức hoán đổi hai cột của ma trận.
     * @param firstIndex
     * @param secondIndex
     */
    public void swapColumns(int firstIndex, int secondIndex) {
        for (int row = 0; row < rows; row++) {
            double tmp = this.get(row, firstIndex);
            this.set(row, firstIndex, this.get(row, secondIndex));
            this.set(row, secondIndex, tmp);
        }
    }

    /**
     * Phương thức cộng hàng destIndex của ma trận với hàng sourceIndex của ma trận được nhân với một số value.
     * @param value
     * @param sourceIndex
     * @param destIndex
     */
    public void addRow(double value, int sourceIndex, int destIndex) {
        for (int column = 0; column < columns; column++) {
            this.data[destIndex][column] += this.get(sourceIndex, column) * value;
        }
    }

    /**
     * Phương thức cộng cột destIndex của ma trận với cột sourceIndex của ma trận được nhân với một số value.
     * @param value
     * @param sourceIndex
     * @param destIndex
     */
    public void addColumn(double value, int sourceIndex, int destIndex) {
        for (int row = 0; row < rows; row++) {
            this.data[row][destIndex] += this.get(row, sourceIndex) * value;
        }
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public Matrix transpose() {
        Matrix newMatrix = new Matrix(columns, rows);

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                newMatrix.set(column, row, this.get(row, column));
            }
        }

        return newMatrix;
    }

    /**
     * Phương thức lấy ra ma trận dạng hình thang theo hàng (row echelon form)
     * sau khi thực hiện phép khử Gauss.
     * @return ma trận dạng hình thang theo hàng.
     */
    public Matrix gaussianElimination() {
        Matrix result = new Matrix(columns, rows);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.set(i, j, this.get(i, j));
            }
        }

        int pivotRow = 0;
        int pivotColumn = 0;

        while (pivotRow < rows && pivotColumn < columns) {
            int maxRow = pivotRow;
            double maxValue = Math.abs(result.get(pivotRow, pivotColumn));

            for (int i = pivotRow + 1; i < rows; i++) {
                double currentVal = Math.abs(result.get(i, pivotColumn));
                if (currentVal > maxValue) {
                    maxValue = currentVal;
                    maxRow = i;
                }
            }

            if (maxValue == 0) {
                pivotColumn++;
                continue;
            }

            if (maxRow != pivotRow) {
                result.swapRows(pivotRow, maxRow);
            }

            for (int i = pivotRow + 1; i < rows; i++) {
                double factor = result.get(i, pivotColumn) / result.get(pivotRow, pivotColumn);
                result.addRow(-factor, pivotRow, i);
            }

            pivotRow++;
            pivotColumn++;
        }

        return result;
    }

    /**
     * Biểu diễn ma trận theo định dạng
     * a11 a12 ... a1n
     * a21 a22 ... a2n
     * ...
     * am1 am2 ... amn
     * @return một chuỗi biểu diễn ma trận.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (double[] row : data) {
            for (double number : row) {
                result.append(String.format("%7.3f", number));
                result.append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }
}
