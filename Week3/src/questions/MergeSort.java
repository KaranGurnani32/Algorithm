package questions;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {

//        int[] a = inputArray();
//        int[] b = inputArray();
//
//        int[] c = merge(a, b);

        int[] n = inputArray();

        int[] s = mergeSort(n);
//
//        printArray(a);
//        printArray(b);
//        printArray(c);
        printArray(n);
        printArray(s);

    }

    private static int[] mergeSort(int[] a) {
        if(a.length == 1) {
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
            right[i] = a[i+mid];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }


    private static void printArray(int[] a) {
        System.out.println("--------------------");
        for (int element : a) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("--------------------");
    }

    private static int[] merge(int[] a, int[] b) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] c = new int[a.length + b.length];

        //while any of the index are inside
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        //if i is inside a
        while (i < a.length) {
            c[k++] = a[i++];
        }

        //if j is inside b
        while (j < b.length) {
            c[k++] = b[j++];
        }

        return c;
    }

    private static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input number string : ");
        String input = scanner.nextLine();

        String[] aString = input.split("");
        int[] a = new int[aString.length];
        for (int i = 0; i < aString.length; i++) {
            a[i] = Integer.parseInt(aString[i]);
        }

        return a;
    }

}
