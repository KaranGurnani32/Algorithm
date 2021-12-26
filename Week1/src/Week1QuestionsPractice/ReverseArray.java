package Week1QuestionsPractice;

public class ReverseArray {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        printArray(a);

        a = reverseArray(a);
    }

    private static int[] reverseArray(int[] a) {

        int left = 0;
        int right = a.length-1;
        while (left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }

    private static void printArray(int[] a) {
        System.out.println("-----------");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
