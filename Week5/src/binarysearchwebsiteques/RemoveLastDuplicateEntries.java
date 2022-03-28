package binarysearchwebsiteques;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveLastDuplicateEntries {
    public static void main(String[] args) {
        int[] nums = {1, 0};

        System.out.println(Arrays.toString(solve(nums)));
    }

    private static int[] solve(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int element : nums) {
            set.add(element);
        }

        int n = set.size();
        int[] a = new int[n];
        int i = 0;
        for (int x : set) {
            a[i++] = x;
        }
        return a;
    }
}
