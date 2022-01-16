package Week2Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student {
    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();

        m.put(1, "james1");
        m.put(2, "james2");
        m.put(3, "james3");
        m.put(4, "james4");
        m.put(5, "james5");

        Set<Map.Entry<Integer, String>> entries = m.entrySet();
    }
}
