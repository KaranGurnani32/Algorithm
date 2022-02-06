package PracticeMatrix;

import java.util.Scanner;

public class BasicMatrixCode {
    public static void main(String[] args) {

        int [][] a = new int[2][2];
        int [][] b = new int[2][2];

        inputMatrix(a);
//        inputMatrix(b);

        printMatrix(a);
//        printMatrix(b);
//        System.out.println("-------------");
//        int [][] sum = add(a, b);
//        int [][] diff = subtract(a,b);
//        int [][] product = multiply(a, b);
    }

    private static int[][] add(int[][] a, int[][] b) {
        if (!validate(a, b)){
            System.out.println("rows and column dont match");
            return null;
        }

        int row = a.length;
        int col = a[0].length;

        int [][] sum = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum [i][j] = a[i][j] + b[i][j];
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

    private static int[][] multiply(int[][] a, int[][] b) {
        int rowA = a.length;
        int colA = a[0].length;
        int rowB = b.length;
        int colB = b[0].length;

        if(colA !=rowB){
            System.out.println("cant be multiplied");
            return null;
        }

        int[][] c = new int[rowA][colB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                int term = 0;
                for (int k = 0; k < colA; k++) {
                    term+= a[i][k] * b[k][j];
                }
                c[i][j]= term;
            }
        }
        return c;
    }

    private static int[][] subtract(int[][] a, int[][] b) {
        if (!validate(a, b)){
            System.out.println("rows and column don't match");
            return null;
        }

        int row = a.length;
        int col = a[0].length;

        int [][] subtract = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                subtract [i][j] = a[i][j] - b[i][j];
            }
        }
        return subtract;
    }

    private static void printMatrix(int [][] matrix) {
//        Scanner scanner = new Scanner(System.in);
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
                System.out.println("Enter element (" + i + ", " + j + ") :");
                matrix[i][j] = scanner.nextInt();
            }
        }

    }

}