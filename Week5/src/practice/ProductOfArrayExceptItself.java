package practice;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] a = {6, 9, 5, 2, 7, 1};

        printArray(a);
        printArray(solve(a));
    }

    private static int[] solve(int[] a) {
        int n = a.length;
        if (n == 1) {
            System.out.println(0);
        }

        int i = 1;
        int temp = 1;

        int[] prod = new int[n];

        for (int j = 0; j < n; j++) {
            prod[j] = 1;
        }

        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= a[i];
        }

        temp = 1;

        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= a[i];
        }

        return prod;
    }

//    private static int[] solve(int[] a) {
//        TC- O(n) SC - O(n)
//        int n = a.length;
//
//        if (n == 1) {
//            System.out.println(0);
//        }
//
//        int[] left = new int[n];
//        int[] right = new int[n];
//        int[] prod = new int[n];
//
//        left[0] = 1;
//        right[n - 1] = 1;
//
//        for (int i = 1; i < n; i++) {
//            left[i] = a[i - 1] * left[i - 1];
//        }
//
//        for (int j = n - 2; j >= 0; j--) {
//            right[j] = a[j + 1] * right[j + 1];
//        }
//
//        for (int i = 0; i < n; i++) {
//            prod[i] = left[i] * right[i];
//        }
//        return prod;
//    }

    private static void printArray(int[] a) {

        for (int element : a) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
