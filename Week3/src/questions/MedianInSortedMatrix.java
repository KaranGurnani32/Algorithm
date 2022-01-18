package questions;

public class MedianInSortedMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int row = 3;
        int col = 3;

        int location = binarySearch(matrix, 5);
        System.out.println(location);
    }

    private static int binarySearch(int[][] matrix, int element) {
        int left = 0;
        int right = matrix.length-1;

        int mid = (left + right) / 2;

        if (matrix[mid][mid] == element) {
            return mid;
        } else if (matrix[mid][mid] < element) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        return -1;
    }
}