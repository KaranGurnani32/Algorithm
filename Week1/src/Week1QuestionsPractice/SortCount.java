package Week1QuestionsPractice;

public class SortCount {
    public static void main(String[] args) {
        int [] a = {0, 2, 1, 2, 1, 2, 0, 0, 1, 2, 2, 2,1};

        printArray(a);

        a = sortArray(a);
        printArray(a);
    }

    private static int[] sortArray(int[] a) {
        //count no of 0s 1s and 2s
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]==0){
             count0++;
            } else if (a[i]==0){
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;

        for (int i = 0; i < count0; i++) {
            a[index] = 0;
            index++;
        }
        for (int i = 0; i < count1; i++) {
            a[index++] = 1;
        }

        for (int i = 0; i < count2; i++) {
            a[index++] = 2;
        }
        return a;
    }

    private static void printArray(int[] a) {
        System.out.println("-----------");
        for (int element: a){
            System.out.println(element + ", ");
        }
        System.out.println();
        System.out.println("-------------");
    }
}
