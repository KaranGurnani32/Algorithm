package array;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(runningSum(nums)));
    }

    private static int[] runningSum(int[] nums) { // T - O(n), S - O(n)
        int[] array = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            array[i] = temp;
        }
        return array;
    }
}
