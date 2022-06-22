package array;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 5, 5, 6, 7, 6, 7, 9};

        int element = singleNumber(nums);
        System.out.println(element);
    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        // Check for single element
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
