package binarysearchwebsiteques;

public class Base3ToInteger {
    public static void main(String[] args) {
        String s = "10";

        System.out.println(Solution(s));
    }

    private static int Solution(String s) {

        int a = Integer.parseInt(s) / 3;

        return a;
    }
}
