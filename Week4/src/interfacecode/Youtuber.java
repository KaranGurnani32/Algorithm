package interfacecode;

public interface Youtuber {
    abstract void makeVideo();

    default void read() {
        System.out.println("reading");
    }
}

