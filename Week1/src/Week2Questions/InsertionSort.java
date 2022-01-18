package Week2Questions;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {8, 1, 3, 0, 6, 9, 2, 8, 4, 3};

        printArray(a);

//        insertionSort(a);
        descendingInsertionSort(a);

        printArray(a);
    }

    private static void descendingInsertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = i - 1;
            int temp = a[i];
            while (j >= 0 && a[j] < temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    private static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i - 1; //just one element before
            int temp = a[i];
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j]; // right shift the bigger number
                j--;
            }

            a[j + 1] = temp;
        }
    }

    private static void printArray(int[] a) {
        System.out.println("---------------------------------------");
        for (int element : a) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }
}
