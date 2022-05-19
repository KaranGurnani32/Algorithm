package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String input = "abcabcbb";

        System.out.println(lengthOfLongestSubString(input));
    }

    private static int lengthOfLongestSubString(String input) {

        // Taking 2 pointers
        int left = 0;
        int right = 0;

        Set<Character> seen = new HashSet<>();
        int max = 0;

        while (right < input.length()) {

            char symbol = input.charAt(right);
            if (seen.add(symbol)) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                while (input.charAt(left) != symbol) {
                    seen.remove(input.charAt(left));
                    left++;
                }
                seen.remove(symbol);
                left++;
            }
        }


        return max;

    }
}
