package Week2QuestionsPractice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int location = binarySearch(a, 5);
        System.out.println(location);
    }

    private static int binarySearch(int[] a, int element) {
        int left = 0;
        int right = a.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            if (a[mid] == element) {
                return mid;
            } else if (a[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
