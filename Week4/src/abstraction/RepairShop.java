package abstraction;

public class RepairShop {

    public static void repair(Car car){
        System.out.println("car is repaired");
    }

//    public static void repair(WagonR car) {
//        System.out.println("WagonR car is repaired");
//    }

    //Overloading
//    public static void repair(Audi car) {
//        System.out.println("Audi car is repaired");
//    }

    public static void main(String[] args) {

        WagonR wagonR = new WagonR();
        Audi audi = new Audi();

        repair(wagonR);
        repair(audi);
    }

}

abstract class Car {

    //we cannot have abstract method inside a non-abstract class
    //we cannot make object of abstract class
    //abstract class can have non-abstract method they are called concrete methods

    public abstract void accelerate();

    public abstract void braking();

    public void honk() {
        System.out.println("car is honking");
    }
 }

class WagonR extends Car {

    //we have to implement all methods if we extend an abstract class
    //implementation of non-abstract method is not compulsory

    public void accelerate() {
        System.out.println("WagonR is accelerating");
    }

    public void braking() {
        System.out.println("WagonR is braking");
    }
}

//hierarchical inheritance
class Audi extends Car {

    public void accelerate() {
        System.out.println("Audi is accelerating");
    }

    public void braking() {
        System.out.println("Audi is braking");
    }
}
