package string;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String s = "baab";

        System.out.println(naiveLongestPalindrome(s));
    }

    private static int naiveLongestPalindrome(String s) {

        int n = s.length();

        int maxLength = 1;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                int flag = 1;

                // check palindrome
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(i + k) != s.charAt(j - k)) {
                        flag = 0;
                    }
                }

                // Palindrome
                if (flag != 0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }
        return maxLength;
    }

    private static boolean palindrome(String s1) {
        int i = 0;
        int j = s1.length() - 1;

        if (s1.substring(i,j) == s1.substring(j, i)) {
            return true;
        }
        return false;
    }
}

