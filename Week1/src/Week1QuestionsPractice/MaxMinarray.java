package Week1QuestionsPractice;

public class MaxMinarray {
    public static void main(String[] args) {
        int [] a = {58, 41, 28, 63, 78, 54, 67, 73, 9};

        printarray(a);

        int max = maximumFromArray(a);
        int min = minFromArray(a);

        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }

    private static int maximumFromArray(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max<a[i]){
                max = a[i];
            }
        }
        return max;
    }

    private static int minFromArray(int[] a) {
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min>a[i]){
                min = a[i];
            }
        }
        return min;
    }

    private static void printarray(int[] a) {
        System.out.println("---------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }
}
