package Week1Questions;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int [] b = {1, 2, 3, 4, 5};
        int [] c = {1, 2, 3, 4, 5};
        printArrray(array);
        array = reverseArray(array);

        printArrray(array);

    }

    private static int[] reverseArray(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left<right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

    private static void printArrray(int [] array) {
        System.out.println("-----------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-----------");

    }
}
