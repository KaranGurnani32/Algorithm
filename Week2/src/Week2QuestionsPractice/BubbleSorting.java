package Week2QuestionsPractice;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] a = {8, 1, 3, 0, 6, 9, 2, 8, 4, 3};

        printArray(a);

        bubbleSort(a);
        printArray(a);

        bubbleDescendingSort(a);
        printArray(a);
    }

    private static void bubbleDescendingSort(int[] a) {
        for (int round = 0; round < a.length; round++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    private static void bubbleSort(int[] a) {
        for (int round = 0; round < a.length; round++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
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
