package practicecodes;

import java.util.Scanner;

public class BinarySearchQuestion {
    public static void main(String[] args) {
        // Given a sorted array of size N and an integer K,
        // find the position at which K is present in the array using binary search.
        // N = 5

        int[] a = inputArray();

        int k = 5;
        int location = BinarySearch(a, k);

        if (location == -1){
            System.out.println("Element not present");
        } else {
            System.out.println(location);
        }
    }

    private static int[] inputArray() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String array input : ");
        String input = scanner.nextLine();

        String[] input2 = input.split(" ");
        int[] c = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            c[i] = Integer.parseInt(input2[i]);
        }
        return c;

    }

    private static int BinarySearch(int[] a, int k) { // time complexity O(logn) // space - O(1)

        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == k) {
                return mid;
            } else if (a[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
