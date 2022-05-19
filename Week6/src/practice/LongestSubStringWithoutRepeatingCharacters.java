package practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(solve(s));
    }

    private static int solve(String s) {

        int left = 0;
        int right = 0;

        Set<Character> seen = new HashSet<>();
        int max = 0; // use to save the biggest substring

        while (right < s.length()) { // will move right pointer till the string ends
            char C = s.charAt(right);
            if (seen.add(C)) { // doubt - is it a boolean expression
                max = Math.max(max, right - left + 1);
                right++;
            } else {

                while (s.charAt(left) != C) { // removing character before the character C until we get that
                    seen.remove(s.charAt(left));
                    left++;
                } // now removing the same character
                seen.remove(C); // doubt how
                left++;
            }
        }

        return max;
    }
}
