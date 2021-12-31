package Week1Questions;

public class KadanesAlgo {
    //Find the longest subsequence giving max sum in an array
    /*
    In this question we have to find max sum in an array, and it may or may not include negative numbers
    example: {1,3,-14,5,7,0,-2,10,-19}
    in that case (5,7,0,-2,10) is the best longest sum
     */
    public static void main(String[] args) {
        int[] a = {1, 3, -14, 5, 7, 0, -2, 10, -19};
//        5, 7, 0, -2, 10, 19
        int currentSum = 0;
        int overallSum = 0;

        int start = 0;
        int end = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] + currentSum >= 0) {
                currentSum = currentSum + a[i];
            } else {
                currentSum = 0;
                start = i + 1;
            }
            if (currentSum >= overallSum) {
                overallSum = currentSum;
                end = i;
            }
        }
        System.out.println("max sum = " + overallSum);
        printArray(a, start, end);
    }

    private static void printArray(int [] array, int start, int end) {
        System.out.println("-----------");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-----------");

    }
}
//    // Find the longest subsequence giving maximum sum in an array
//    //create an array
//    int[] a = {1, 3, -14, 5, 7, 0, -2, 10, -19};
//    //        int index = 0;
//    int sol = 0;
//    //we will start from first element
//    //then will add 2nd element and third and so on
//    //and at every step check that the sum is increased or decreased
//        for (int i = 0; i < ; i++) {
//
//    }
//    //if sum is decreased then don't add
//    //then check from 2nd element the same process
