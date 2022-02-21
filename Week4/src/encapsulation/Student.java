package encapsulation;

public class Student {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class MainClass {

    public static void main(String[] args) {
        Student obj = new Student();

        obj.setAge(12);
        obj.setName("Karan");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
