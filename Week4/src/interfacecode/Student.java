package interfacecode;

public interface Student {

    //we can declare constructor of interface, but it should have return type
    void Student();
    //by default methods in interface are public and abstract
    //by default any attribute (data type not method)in interface is public static and final

    //we can make a method with its body by using default keyword

    default void read() {
        System.out.println("reading");
    }

    int x = 6;

    void study();
}
