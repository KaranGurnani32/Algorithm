package Week2Questions;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String[] args) {
        Map<Object, Object> data = new HashMap();

        data.put("kanishk", "masters of griffendor");
        data.put("karan", "masters of hufflepuff");
        data.put("kunal", "masters of slytherine");
        data.put("ojas", "masters of ravenclaw");

        System.out.println(data.get("kunal"));

        for (Map.Entry<Object, Object> datum : data.entrySet()) {
            System.out.println(datum.getKey() + " ---> " + datum.getValue());
        }

    }
}