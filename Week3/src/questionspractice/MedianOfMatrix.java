package questionspractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row : ");
        int row = scanner.nextInt();
        System.out.println("Enter column : ");
        int col = scanner.nextInt();
        int matrix[][] = new int[row][col];

        inputMatrix(matrix);

        printMatrix(matrix);
//        int median = getMedianNaive(matrix);
        int median = getMedianEfficient(matrix);
        System.out.println(median);
    }

    private static int getMedianEfficient(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int n = row * col;

        int min = matrix[0][0];
        int max = matrix[0][col - 1];

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] < min) {
                min = matrix[i][0];
            }

            if (matrix[i][col - 1] > max) {
                max = matrix[i][col - 1];
            }
        }

        int low = min;
        int high = max;

        System.out.println(min + "  " + max);
        int desired = ((n + 1) / 2);
        while (low <= high) {
            int mid = (low + high) / 2;

            System.out.println("Count for " + mid + " = " + countLessThanEqualsToEfficient(matrix, mid));

        }

        return low;

    }

    private static int countLessThanEqualsToEfficient(int[][] matrix, int element) {
        int row = matrix.length;
        int col = matrix[0].length;

        int count = 0;

        for (int i = 0; i < row; i++) {
            count = count + binarySearchLessThan(matrix[i], element);
        }

        return count;
    }

    private static int binarySearchLessThan(int[] a, int element) {
        int low = 0;
        int high = a.length - 1;

        while (low < high) {
            int mid = low + high / 2;
            if (a[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + 1;
    }

    private static int countLessThanEqualsTo(int[][] matrix, int element) {
        int row = matrix.length;
        int col = matrix[0].length;

        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] <= element) {
                    count++;
                }
            }
        }

        return count;
    }

    private static int getMedianNaive(int[][] matrix) {
        ArrayList<Integer> array = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array.add(matrix[i][j]);
            }
        }

        Collections.sort(array);

        int n = row * col;

        int medianLocation = (n + 1) / 2;

        return array.get(medianLocation - 1);
    }

    private static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        System.out.println("--------------");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------");
    }

    private static void inputMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element (" + i + ", " + j + ") : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}


