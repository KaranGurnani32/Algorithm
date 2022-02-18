package Week2Questions;

public class BinarySearch {
//    public static void main(String[] args) {
//        int [] a = {1, 2, 3, 4, 88, 185, 390, 542};
//        int element = 542;
//        int location = binarySearchArray(a, element);
//        System.out.println(location);
//
//    }

    private static int binarySearchArray(int[] a, int element) {
        int left = 0;
        int right = a.length-1;

        while (left<=right){
            int mid = (left + right) / 2;

            if (a[mid] == element){
                return mid;
            } else if (a[mid] < element){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }


}
