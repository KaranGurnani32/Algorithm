package Week1QuestionsPractice;

public class MoveNegative {
    public static void main(String[] args) {
        int [] a = {9, 54, 32, -76, 88, -56, 41,-97};
        printArray(a);

        a = NegativeArray(a);

        printArray(a);
    }

    private static int[] NegativeArray(int[] a) {
        int[] b = new int[a.length];

        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]<0){
                b[index] = a[i];
                index++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i]>=0){
                b[index++] = a[i];
            }
        }
        return b;
    }


    private static void printArray(int[] a) {
        System.out.println("------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        System.out.println("-----------");
    }
}
