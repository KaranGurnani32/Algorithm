package array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-4, -1, 3, 7, 10, 11};

        int key = 2;
        System.out.println(binarySearch(array, key));
    }

    private static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else if (array[mid] < key){
                low = mid + 1;
            }
        }
        return low;
    }
}
