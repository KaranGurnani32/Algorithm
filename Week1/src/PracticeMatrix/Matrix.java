package PracticeMatrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
//        int [] array = new int[10];
        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter element " + i + ": ");
//            array[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < array.length; i++) {
//        System.out.println("element " + i + ": " + array[i]);
//        }
        ////////////////////////////////////////////////////////////////////////
        int [][] matrix = new int[3][3];
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element (" + i + ", " + j + ") : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
