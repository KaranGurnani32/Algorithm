package Week1Questions;

import java.util.Scanner;
public class SortCount {

    //sort an array that contains only 3 distinct elements (0, 1, 2)
    //{1, 1, 1, 1, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 2, 2, 2, 2}
    //{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] a = new int[size];

        inputArray(a);

        printArray(a);

        a = sort(a, 0,1,2);

        printArray(a);
    }

    private static void inputArray(int[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of the array of size " + a.length);

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
    }

    private static int[] sort(int[] a, int element, int element2, int element3) {
//        //do it
//        while(){
//
//        }
        return null;
    }

    private static void printArray(int[] array) {
        System.out.println("------------------------");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("------------------------");
    }
}
