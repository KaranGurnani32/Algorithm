package PracticeMatrix;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];

        int rowA = a.length;
        int colA = a[0].length;
        int rowB = b.length;
        int colB = b[0].length;

        inputMatrix(a);
        inputMatrix(b);

        printMatrix2(a);
        printMatrix2(b);
        System.out.println("------------");
        int[][] product = multiply(a,b);
        printMatrix2(product);
    }

    private static int[][] multiply(int[][] a, int[][] b) {
        int rowA = a.length;
        int colA = a[0].length;
        int rowB = b.length;
        int colB = b[0].length;

        if(colA !=rowB){
            System.out.println("cannot be multiplied");
            return null;
        }

        int[][] c = new int[rowA][colB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                int term = 0;
                for (int k = 0; k < colA; k++) {
                    term = term + a[i][k] * b[k][i];
//                    term += a[i][k] * b[k][i];
                }
                c[i][j] = term;
            }
        }
        return c;
    }

    private static void printMatrix2(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static void inputMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element (" + i + ", " + j + ") :");
                matrix[i][j] = scanner.nextInt();
            }

        }
    }
}