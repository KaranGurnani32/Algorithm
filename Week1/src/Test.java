import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //take input for row and column
        //create a matrix and print the same
        //create a function to get the elements of the matrix when travelled in spiral(spriral1) fashion in anti-clockwise
        //create a function to get the elements of the matrix when travelled in spiral(spriral2) fashion in clockwise
        //find the union and intersection of spiral1 and spiral2
        int[][] a = new int[4][4];

        inputMatrix(a);
        printMatrix(a);

        int [] spiral1 = antiClockWise(a);
        printArrayOfFollowing(spiral1);
        int [] spiral2 = clockWise(a);
        printArrayOfFollowing(spiral2);
    }

    private static int[] clockWise(int[][] a) {
        int count = a.length * a[0].length;

        int [] spiral2 = new int[count];
        int minR = 0;
        int maxR = a.length-1;
        int minC = 0;
        int maxC = a[0].length-1;
        int index = 0;

        while (index<count){
            //right
            for (int j = minC; j <= maxC; j++) {
                spiral2[index++] = a[minR][j];
            }
            minR++;

            //bottom
            for (int i = minR; i <= maxR ; i++) {
                spiral2[index++] = a[i][maxC];
            }
            maxC--;

            //left
            for (int j = maxC; j >= minC; j--) {
                spiral2[index++] = a[maxR][j];
            }
            maxR--;

            //up
            for (int i = maxR; i >= minR; i--) {
                spiral2[index++] = a[i][minC];
            }
            minC++;

        }
        return spiral2;
    }

    private static void printArrayOfFollowing(int[] a) {
        System.out.println("---------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

    private static int[] antiClockWise(int[][] a) {
        int count = a.length * a[0].length;

        int [] spiral1 = new int[count];
        int minR = 0;
        int maxR = a.length-1;
        int minC = 0;
        int maxC = a[0].length-1;
        int index = 0;

        while (index<count){
            //bottom
            for (int i = minR; i <= maxR ; i++) {
                spiral1[index++] = a[i][minC];
            }
            minC++;

            //right
            for (int j = minC; j <= maxC; j++) {
                spiral1[index++] = a[maxR][j];
            }
            maxR--;

            //up
            for (int i = maxR; i >= minR; i--) {
                spiral1[index++] = a[i][maxC];
            }
            maxC--;

            //left
            for (int j = maxC; j >= minC; j--) {
                spiral1[index++] = a[minR][j];
            }
            minR++;
        }
        return spiral1;
    }

    private static void printMatrix(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static void inputMatrix(int[][] a) {
        Scanner scanner = new Scanner(System.in);

        int row = a.length;
        int col = a[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Element (" + i + ", " + j + ") :");
                a[i][j] = scanner.nextInt();
            }
        }
    }
}
