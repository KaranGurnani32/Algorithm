package Keywords;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = inputArray();

        printArray(a);

        int[] b = mergeSort(a);
        printArray(b);

    }

    private static int[] mergeSort(int[] a) {
        if (a.length == 1) {
            return a;
        }

        int mid = a.length / 2;
        int leftSize = mid;
        int rightSize = a.length - mid;

        int[] left = new int[leftSize];

        for (int i = 0; i < leftSize; i++) {
            left[i] = a[i];
        }

        int[] right = new int[rightSize];

        for (int i = 0; i < rightSize; i++) {
            right[i] = a[i + mid];
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

        while (i<a.length) {
            c[k++] = a[i++];
        }

        while (j<b.length) {
            c[k++] = b[j++];
        }

        return c;
    }

    private static void printArray(int[] a) {
        System.out.println("----------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        System.out.println("----------------");
    }

    private static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        String input = sc.nextLine();

        String[] strings = input.split(" ");
        int[] c = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            c[i] = Integer.parseInt(strings[i]);
        }

        return c;
    }


}
