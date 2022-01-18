package Week2QuestionsPractice;

import java.util.HashMap;
import java.util.Map;

public class CountDistinct {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 1, 1, 1, 2, 2, 2, 2, 2, 2, 5, 5, 5, 3, 3, 3, 3, 5, 5, 5, 1, 8};

        Map<Integer, Integer> map = new HashMap<>();

        for (int element : array){
            if (map.containsKey(element)){
                int previousValue = map.get(element);
                map.put(element, previousValue +1);
            } else {
                map.put(element,1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " came " + entry.getValue() + " times ");
        }
    }
}
