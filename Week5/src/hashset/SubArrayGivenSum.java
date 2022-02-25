package hashset;

import java.util.HashMap;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        int [] a = {8,2,5,6,3,1,89,54,6};
        int sum = 60;
        subArray(a, sum);
    }

    public static void subArray(int[] a, int sum) {
        int currentSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            currentSum += a[i];
            if (currentSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currentSum - sum)) {
                start = map.get(currentSum-sum) +1;
                end = i;
                break;
            }
            map.put(currentSum, i);
        }
        if (end == -1) {
            System.out.println("Not found" );
        } else {
            System.out.println(start + ", " + end);
        }
    }
}
