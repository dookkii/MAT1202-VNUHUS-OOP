package Homework2;

public class Matrix {
    public static void print(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }

        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }

        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }

        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }

        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] newMatrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                newMatrix[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }

        return newMatrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int rows = matrix1.length;
        int columns = matrix1[0].length;
        double[][] newMatrix = new double[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                newMatrix[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }

        return newMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] newMatrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                newMatrix[row][column] = matrix1[row][column] - matrix2[row][column];
            }
        }

        return newMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }

        int rows = matrix1.length;
        int columns = matrix1[0].length;
        double[][] newMatrix = new double[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                newMatrix[row][column] = matrix1[row][column] - matrix2[row][column];
            }
        }

        return newMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2[0].length) {
            return null;
        }

        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int[][] newMatrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                for (int tmp = 0; tmp < matrix1.length; tmp++) {
                    newMatrix[row][column] += matrix1[row][tmp] + matrix2[tmp][column];
                }
            }
        }

        return newMatrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2[0].length) {
            return null;
        }

        int rows = matrix1.length;
        int columns = matrix2[0].length;
        double[][] newMatrix = new double[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                for (int tmp = 0; tmp < matrix1.length; tmp++) {
                    newMatrix[row][column] += matrix1[row][tmp] + matrix2[tmp][column];
                }
            }
        }

        return newMatrix;
    }

    public static void main(String[] args) {
        int[][] matrixInt = {{1, 2}, {3, 4}};
        double[][] matrixDouble = {{1.2, 3.4}, {5.6, 7.8}};

        int[][] matrixInt1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixInt2 = {{5, 6}, {7, 8}};
        double[][] matrixDouble1 = {{1.2, 3.4, 5.6}, {7.8, 9.10, 10.11}};
        double[][] matrixDouble2 = {{9.10, 11.12}, {13.14, 15.16}};

        print(matrixInt);
        print(matrixDouble);
        System.out.println(haveSameDimension(matrixInt, matrixInt1));
        System.out.println(haveSameDimension(matrixInt, matrixInt2));
        System.out.println(haveSameDimension(matrixDouble, matrixDouble1));
        System.out.println(haveSameDimension(matrixDouble, matrixDouble2));
        print(add(matrixInt, matrixInt2));
        print(add(matrixDouble, matrixDouble2));
        print(subtract(matrixInt, matrixInt2));
        print(subtract(matrixDouble, matrixDouble2));
        print(multiply(matrixInt1, matrixInt));
        print(multiply(matrixDouble1, matrixDouble));
    }
}