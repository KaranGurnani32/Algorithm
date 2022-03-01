package questionspractice;

import java.util.Scanner;

public class MergeSort {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = inputArray();
        int[] b = inputArray();

        printArray(a);
        printArray(b);

        int[] c = mergeSort(a);
    }

    private static int[] mergeSort(int[] a) {
        if (a.length == 1) {
            return a;
        }

        int mid = a.length / 2;
        int leftSize = mid;
        int rightSize = a.length - mid;

        int [] left = new int[leftSize];
        for (int i = 0; i < leftSize; i++) {
            left[i] = a[i];
        }

        int [] right = new int[rightSize];
        for (int i = 0; i < rightSize; i++) {
            right[i] = a[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] a, int[] b) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] c = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (i < b.length) {
            c[k++] = b[j++];
        }

        return c;
    }

    private static void printArray(int[] array) {
        System.out.println("---------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("---------------");
    }

    private static int[] inputArray() {
        System.out.println("Enter the array string input : ");
        String input = scanner.nextLine();

        String[] input2 = input.split(" ");
        int[] array = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            array[i] = Integer.parseInt(input2[i]);
        }

        return array;

    }
}
