package heap;

public class HeapSort {

    public static void main(String[] args) {
        int[] a = {8, 1, 3, 0, 69, 2, 8, 43, 56, -89, -6};

        System.out.println("main array : ");
        printArray(a);

        heapSort(a);
    }

    private static void heapSort(int[] a) { //time complexity O(nlogn)
        buildHeap(a);
        System.out.println("after building array");
        printArray(a);
        for (int i = a.length - 1; i >= 0 ; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            System.out.println("before heapify" + i);
            printArray(a);
            heapify(a,i,0);
            System.out.println("after heapify" + i);
            printArray(a);
        }

    }

    private static void buildHeap(int[] a) { // O(n)
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            heapify(a, a.length, i);
        }
    }

    private static void heapify(int[] a, int n, int index) { //O(logn) converting array to heap
        int parent = index;
        int left = 2 * parent + 1;
        int right = 2 * parent + 2;
        int largest = parent;

        if (left < n && a[left] > a[largest]) {
            largest = left;
        }

        if (right < n && a[right] > a[largest]) {
            largest = right;
        }

        if (largest != parent) {
            int temp = a[largest];
            a[largest] = a[parent];
            a[parent] = temp;

            heapify(a, n, largest);
        }
    }

    private static void printArray(int[] a) {
        System.out.println("----------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        System.out.println("----------------");
    }
}
