package homework2;

import java.util.Scanner;

public class NestedLoopsExercise {
    public static Scanner scanner;

    public static void squarePattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void testSquarePattern() {
        System.out.print("Enter the size: ");

        int size = scanner.nextInt();
        squarePattern(size);
    }

    public static void checkerPattern(int size) {
        for (int row = 1; row <= size; row++) {
            if (row % 2 == 0) {
                System.out.print(" ");
            }

            for (int column = 1; column <= size; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void testCheckerPattern() {
        System.out.print("Enter the size: ");

        int size = scanner.nextInt();
        checkerPattern(size);
    }

    public static void timeTable(int n) {
        System.out.print(" * |");

        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();
        for (int i = 1; i <= n + 1; i++) {
            System.out.printf("%4s", "----");
        }

        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i);

            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
    }

    public static void testTimeTable() {
        System.out.print("Enter the size: ");

        int size = scanner.nextInt();
        timeTable(size);
    }

    public static void triangularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (row >= column) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (row + column <= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (column >= row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (column >= size + 1 - row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern() {
        System.out.print("Enter the size: ");

        int size = scanner.nextInt();
        triangularPatternA(size);
        System.out.println("(a)");
        triangularPatternB(size);
        System.out.println("(b)");
        triangularPatternC(size);
        System.out.println("(c)");
        triangularPatternD(size);
        System.out.println("(d)");
    }

    public static void boxPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (row == 1 || row == size) {
                    System.out.print("# ");
                } else if (column == 1 || column == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (row == 1 || row == size) {
                    System.out.print("# ");
                } else if (row == column) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (row == 1 || row == size) {
                    System.out.print("# ");
                } else if (column == size - row + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                if (row == 1 || row == size) {
                    System.out.print("# ");
                } else if (column == size - row + 1 || column == row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testBoxPattern() {
        System.out.print("Enter the size: ");

        int size = scanner.nextInt();
        boxPatternA(size);
        System.out.println("(a)");
        boxPatternB(size);
        System.out.println("(b)");
        boxPatternC(size);
        System.out.println("(c)");
        boxPatternD(size);
        System.out.println("(d)");
    }


    public static void hillPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            int columns = 2 * size - 1;
            for (int column = 1; column <= columns; column++) {
                if ((row + column >= size + 1) && (row >= column - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            int columns = 2 * size - 1;
            for (int column = 1; column <= columns; column++) {
                if ((column >= row) && (column <= columns - row + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            int columns = 2 * size - 1;
            for (int column = 1; column <= columns; column++) {
                if ((row + column >= size + 1) && (row >= column - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int row = 2; row <= size; row++) {
            int columns = 2 * size - 1;
            for (int column = 1; column <= columns; column++) {
                if ((column >= row) && (column <= columns - row + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            int columns = 2 * size - 1;
            for (int column = 1; column <= columns; column++) {
                if ((row + column > size + 1) && (row > column - size + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        for (int row = 2; row <= size; row++) {
            int columns = 2 * size - 1;
            for (int column = 1; column <= columns; column++) {
                if ((column > row) && (column < columns - row + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void testHillPattern() {
        System.out.print("Enter the size: ");

        int size = scanner.nextInt();
        hillPatternA(size);
        System.out.println("(a)");
        hillPatternB(size);
        System.out.println("(b)");
        hillPatternC(size);
        System.out.println("(c)");
        hillPatternD(size);
        System.out.println("(d)");
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        testSquarePattern();
        testCheckerPattern();
        testTimeTable();
        testTriangularPattern();
        testBoxPattern();
        testHillPattern();
    }
}
