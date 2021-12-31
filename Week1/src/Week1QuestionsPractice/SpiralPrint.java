package Week1QuestionsPractice;

import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
//        int [][] a = new int[2][2];
        int [][] a = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};

//        inputMatrix(a);
        printMatrix(a);
        int [] spiral = spiralOfMatrix(a);
        printArray(spiral);
    }

    private static void printArray(int [] array) {
        System.out.println("---------------------------------------");
        for(int element : array) {
            //for each element of array
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }

    private static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();

        }
    }

    private static int[] spiralOfMatrix(int[][] matrix) {
        int count = matrix.length * matrix[0].length;

        int[] array2 = new int[count];

        int minR = 0;
        int maxR = matrix.length-1;
        int minC = 0;
        int maxC = matrix[0].length-1;

        int index = 0;
        while (index<count){
            //right
            for (int j = minC; j <= maxC; j++) {
                array2[index] = matrix[minR][j];
                index++;
            }
            minR++;

            //bottom
            for (int i = minR; i <= maxR; i++) {
                array2[index++] = matrix[i][maxC];
            }
            maxC--;

            //left
            for (int j = maxC; j >= minC; j++) {
                array2[index] = matrix[maxR][j];
                index++;
            }
            maxR--;

            //up
            for (int i = maxR; i >= minR; i++) {
                    array2[index++] = matrix[i][minC];
                }
            minC++;
        }
        return array2;
    }

//    private static void inputMatrix(int[][] matrix) {
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.println("Element (" + i + ", " + j + ") :");
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//    }
}
