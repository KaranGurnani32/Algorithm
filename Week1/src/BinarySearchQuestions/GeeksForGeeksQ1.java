package BinarySearchQuestions;

public class GeeksForGeeksQ1 {
    public static void main(String[] args) {
        // Given a sorted array of size N and an integer K,
        // find the position at which K is present in the array using binary search.
        // N = 5
        int k = 13;
        int [] a = {1, 2, 3, 4, 5};

        int location = binarySearch(a, k);
        if (location == -1){
            System.out.println("Element not present");
        }
        System.out.println(location);
    }

    private static int binarySearch(int[] a, int element) {
        int left = 0;
        int right = a.length-1;

        while (left<=right){
            int mid = (left+right)/2;
            if (a[mid]==element){
                return mid;
            } else if (a[mid]<element){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
