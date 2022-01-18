package Week2QuestionsPractice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {8, 1, 3, 0, 6, 9, 2, 8, 4, 3};

        printArray(a);

        selectionSort(a);
//        selectionDescendingSort(a);

        printArray(a);
    }

    private static void selectionSort(int[] a) {
        int min = 0;

        for (int i = 0; i < a.length-1; i++) {
            min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[min]>a[j]){
                    min = j;
                }
            }

            //swap
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
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
