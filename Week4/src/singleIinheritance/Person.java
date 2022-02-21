package singleIinheritance;

import static singleIinheritance.Person.eat;
import static singleIinheritance.Person.walk;
import static singleIinheritance.Teacher.teaching;

public class Person {

    protected String name;

    public static void walk() {
        System.out.println("Walk method in person");
    }

    public static void eat() {
        System.out.println("Eat method in person");
    }
}

class Teacher extends Person {

    public static void teaching() {
        System.out.println("Teaching method in teacher");
    }
}

class MainClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        //only method can be called cannot add value of any data type
        teacher.name = "Karan";

        //able to call static method without any reference variable
        walk();
        eat();
        teaching();


        //Up Casting(Implicit Casting)
        Person p = teacher;

        //Down Casting
        Person p2 = new Person();

        //p2 maybe a teacher but not sure
//        Teacher t2 = (Teacher) p2;

        //As p is already teacher no error
        Teacher t = (Teacher) p;

        boolean yo = teacher instanceof Teacher;
        System.out.println(yo);
    }
}
