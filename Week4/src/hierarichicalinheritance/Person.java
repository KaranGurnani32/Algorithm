package hierarichicalinheritance;

public class Person {

    String str = "Vicky";
    String name;

    public Person(String name) {
        this.name = name;
        System.out.println("inside person constructor");
    }

    public void walk() {
        System.out.println("Walk method in person");
    }

    public  void eat() {
        System.out.println("Eat method in person");
    }

    public void teaching() {
        System.out.println("Teaching method in Person");
    }
}
//
//class Teacher extends Person {
//
//    String str = "Max";
//
//    public Teacher(String name) {
//        super(name);
//        System.out.println("inside teacher constructor");
//    }
//
//    public void teaching() {
//        System.out.println("Teaching method in teacher");
//    }
//}

class MathsTeacher extends Person {
    String str = "Don";
    public MathsTeacher(String name) {
        super(name);
        System.out.println("inside maths teacher constructor");
    }

    @Override
    public void teaching() {
        System.out.println("Teaching Maths method in MathsTeacher");
    }
}


class MainClass {
    public static void main(String[] args) {

//        Teacher t = new Teacher("Karan");
//        Person p = t;

        MathsTeacher m = new MathsTeacher("Kanishk");

        m.walk();
        m.eat();
        //Teaching method cannot be implemented through m
//        t.teaching();
//        m.teaching();
//        System.out.println(t.str);
//        System.out.println(p.str);
    }
}
