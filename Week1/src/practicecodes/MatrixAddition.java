package practicecodes;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        inputMatrix(matrix1);
        inputMatrix(matrix2);

        printMatrix(matrix1);
        printMatrix(matrix2);

        System.out.println("----------------");
        int[][] sum = add(matrix1, matrix2);
        int[][] multiply = product(matrix1, matrix2);
    }

    private static int[][] product(int[][] a, int[][] b) {
        int rowA = a.length;
        int colA = a[0].length;
        int rowB = b.length;
        int colB = b[0].length;

        if (colA != rowB) {
            System.out.println("Cannot be multiplied");
        }

        int[][] c = new int[rowA][colB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                int term = 0;
                for (int k = 0; k < colA; k++) {
                    term += a[i][k] * b[k][j];
                }
                c[i][j] = term;
            }
        }

        return c;
    }

    private static int[][] add(int[][] a, int[][] b) {
        if (!validate(a, b)) {
            System.out.println("rows & column don't match");
        }

        int row = a.length;
        int column = a[0].length;

        int[][] sum = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    private static boolean validate(int[][] a, int[][] b) {
        int rowA = a.length;
        int colA = a[0].length;
        int rowB = b.length;
        int colB = b[0].length;

        return rowA == rowB && colA == colB;
    }

    private static void printMatrix(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static void inputMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Element (" + i + ", " + j + ") :");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}
