package interfacecode;

public class Person implements Youtuber, Student{


    public static void main(String[] args) {
        int y = 7;

        y = 9;
        Person p = new Person();

        p.study();
        p.makeVideo();
    }

    @Override
    public void study() {
        System.out.println("Person is studying");
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making video");
    }

    @Override
    public void Student() {
        System.out.println("nn");
    }

    @Override
    public void read() {
        System.out.println("mm");
    }
}
