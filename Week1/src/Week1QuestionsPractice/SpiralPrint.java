package Week1QuestionsPractice;

import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        // 1  2   3   4
        // 5  6   7   8
        // 9  10  11  12
        // 13 14  15  16

        inputMatrix(matrix);
        printMatrix(matrix);

        int[] spiral = spiralOfMatrix(matrix);

    }

    private static int[] spiralOfMatrix(int[][] matrix) {

        int minR = 0;
        int maxR = matrix.length;
        int minC = 0;
        int maxC = matrix[0].length;


        int[] spiral = new int[maxR * maxC];

        int index = 0;

        //right
        for (int j = minC; j <= maxC; j++) {
            spiral[index++] = matrix[minR][j];
        }
        minR++;

        //bottom
        for (int i = minR; i <= maxR ; i++) {
            spiral[index++] = matrix[i][maxC];
        }
        maxC--;

        //left
        for (int j = maxC; j <= minC; j++) {
            spiral[index++] = matrix[maxR][j];
        }
        maxR++;

        //up
        for (int i = maxR; i <= minR ; i++) {
            spiral[index++] = matrix[i][minC];
        }
        minC--;

        return spiral;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("------------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }

    private static void inputMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

}
