package sorting;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
//        int [] array = giveRandomArray(10);
        int [] array = {8 , 1, 3, 0, 6, 9, 4, 8};
        System.out.println("Before sorting : ");
        printArray(array);

        quickSort(array);

        System.out.println("After sorting : ");
        printArray(array);

    }

    private static void quickSort(int[] array) {
        int start = 0;
        int end = array.length - 1;
        quickSort(array, start, end);
    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer) {
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            if(leftPointer < rightPointer)
                swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);

        return leftPointer;
    }

    private static void swap(int[] array, int leftPointer, int rightPointer) {
        int temp = array[leftPointer];
        array[leftPointer] = array[rightPointer];
        array[rightPointer] = temp;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    private static int[] giveRandomArray(int size) {
        int [] a = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(100);
        }

        return a;
    }
}
