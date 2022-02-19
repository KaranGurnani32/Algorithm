package questionspractice;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = inputArray();

        printArray(a);
    }

    private static void printArray(int[] a) {

        System.out.println("-----------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        System.out.println("-----------");
    }

    private static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data : ");
        //we take input as string because we can split it
        //we can't split int, we need to take multiple integer
        String input = scanner.nextLine();

        String[] aString = input.split("");

        int[] a = new int[aString.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(aString[i]);
        }
        return a;
    }
}
