package game;

import java.util.Scanner;

public class TicTacToe {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int turn = 1;
        play(turn);

        inputMatrix(matrix);

    }

    private static void play(int turn) {
        String input;

        if (turn == 1) {

        }
    }

    private static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[0][0] + " | " + matrix[0][1] + " | " + matrix[0][2]);
                System.out.print(matrix[1][0] + " | " + matrix[1][1] + " | " + matrix[1][2]);
                System.out.print(matrix[2][0] + " | " + matrix[2][1] + " | " + matrix[2][2]);
            }
            System.out.println();
        }
    }


    private static void inputMatrix(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter (" + i + ", " + j + ")");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
    }
}
