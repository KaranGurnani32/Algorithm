package fibonacci;

public class Fibonacci {
    static int [] memo = new int[1000];

    public static void main(String[] args) {
        int n = 50;
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 0; i < n; i++) {
//            System.out.println(i + " = " + fibonacciRecursive(i));
//            System.out.println(i + " = " + fibonacciMemoised(i));
            System.out.println(i + " = " + fibonacciIterative(i));
        }
    }

    private static int fibonacciIterative(int n) {
        if(n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    private static int fibonacciMemoised(int n) {
        if(n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            if(memo[n-1] != 0) {
                return memo[n-1];
            } else {
                memo[n-1] = fibonacciMemoised(n-1) + fibonacciMemoised(n-2);
                return memo[n-1];
            }
        }
    }

    private static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
    }

    private static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
