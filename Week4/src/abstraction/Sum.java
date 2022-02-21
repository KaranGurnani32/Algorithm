package abstraction;

public class Sum {
    public static void main(String[] args) {
        int a = 5;

        int b = 10;

        sum(a, b);
        System.out.println(divide(a, b));
    }

    private static void sum(int a, int b) {

        int result = a + b;
        System.out.println(result);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("not divisible");
        }
        return a / b;
    }


}
