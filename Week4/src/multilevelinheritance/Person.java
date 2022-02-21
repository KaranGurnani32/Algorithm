package multilevelinheritance;

public class Person {

    String name;
    public void walk() {
        System.out.println("Walk method in person");
    }

    public  void eat() {
        System.out.println("Eat method in person");
    }
}

class Teacher extends Person {

    public void teaching() {
        System.out.println("Teaching method in teacher");
    }
}

class MathsTeacher extends Teacher {
    public void teachingMaths() {
        System.out.println("Teaching Maths method in MathsTeacher");
    }
}

class MainClass {
    public static void main(String[] args) {
        MathsTeacher m = new MathsTeacher();

        m.name = "Kunal";

        m.walk();
        m.eat();
        m.teaching();
        m.teachingMaths();
    }
}
