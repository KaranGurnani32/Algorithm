package Week2QuestionsPractice;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap();

        data.put("Karan", "Heya whats up?");
        data.put("Kanishk", "How are you?");
        data.put("Kunal", "Where you going?");
        data.put("Ojas", "What are you doing?");

        System.out.println(data.get("Ojas"));

        for (Map.Entry<String, String> variable : data.entrySet()){
            System.out.println(variable.getKey() + " ==> " + variable.getValue());
        }
    }
}
