package exceptionhandlingtrycatch;

public class MainClass {
    public static void main(String[] args) {

//        try {
//            int[] a = new int[3];
//
//            System.out.println(a[2]);
//
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage() + " occurred, please check code");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage() + " array out of bounds");
//        } catch (IllegalArgumentException f) {
//            System.out.println(f.getMessage() + " illegal argument");
//        } finally {
//            System.out.println("Sorry for inconvenience");
//        }

        fun1();
    }

    static void fun1() {
        int a = 5;
        int b = 3;

        int c = a / b;
        System.out.println(c);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "occurred");
        }
    }

    static void fun2() throws ArrayIndexOutOfBoundsException{
        boolean isDanger = true;
        if (isDanger) {
            throw new ArrayIndexOutOfBoundsException("danger");
        }
    }
}
