package Week2QuestionsPractice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {8, 1, 3, 0, 6, 9, 2, 8, 4, 3};

        printArray(a);

        selectionSort(a);
        printArray(a);

        selectionDescendingSort(a);
        printArray(a);
    }

    private static void selectionDescendingSort(int[] a) {

        int maxIndex = 0;

        for (int i = 0; i < a.length; i++) {
            maxIndex = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[maxIndex] < a[j]) {
                    maxIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = temp;
        }
    }

    private static void selectionSort(int[] a) {

        int minIndex = 0;

        for (int i = 0; i < a.length; i++) {
            minIndex = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
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
