package binarysearchwebsiteques;

public class SumOfTwoNumbers {
    // Given a list of numbers nums and a number k, return whether any two elements from the list
// add up to k. You may not use the same element twice.
    public static void main(String[] args) {
        int[] nums = {1, 22};
        int k = 44;

        System.out.println(solve(nums, k));
    }

    public static boolean solve(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
