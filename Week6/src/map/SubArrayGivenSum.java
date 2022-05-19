package map;

import java.util.HashMap;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        int[] array = {6, 15, -5, 15, -10, 5};

        int sum = 10;

//        findingSubArray(array, sum);
        subArraySum(array, sum);
    }

    private static void printArray(int[] array) {
        System.out.println("-----------------");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println("-----------------");
    }

    private static void findingSubArray(int[] array, int sum) {

        int n = array.length;
        int currentSum;
        // it takes i and then j1 then j2
        for (int i = 0; i < n; i++) {
            currentSum = array[i];
            for (int j = i + 1; j <= n; j++) {
                if (currentSum == sum) {
                    int p = j - 1;
                    System.out.println("Sum found in " + i + " and " + p);
                }
                if (currentSum > sum || j == n) {
                    break;
                }
                currentSum += array[j];
            }
        }
    }

    private static void subArraySum(int array[], int sum) {
        int curSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            curSum += array[i];
            if (curSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(curSum - sum)) {
                start = map.get(curSum - sum) + 1;
                end = i;
                break;
            }
            map.put(curSum, i);
        }
        if (end == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(start + " " + end);
        }

    }
}
