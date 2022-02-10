package Keywords;

public class ThisKeyword {
    //calling parameterized constructor through default constructor
    /*
    ThisKeyword() {
        this(10);
        System.out.println("hello a");
    }

    ThisKeyword(int i) {
        System.out.println(i);
    }
}

class Test {
    public static void main(String[] args) {
        ThisKeyword ts = new ThisKeyword();
    }
     */

    //this keyword that return statement from the method
    ThisKeyword getA() {
        return this;
    }

    void msg() {
        System.out.println("Hello Java");
    }

}

class Test1 {
    public static void main(String[] args) {
        new ThisKeyword().getA().msg();
    }
}
