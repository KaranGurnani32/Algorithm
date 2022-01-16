package Week2Questions;

import java.util.HashMap;
import java.util.Map;

public class CountDistinct {
    public static void main(String[] args) {
        int [] array = {1, 2, 3 , 1, 1, 1, 2, 2, 2, 2, 2, 2, 5, 5, 5, 3, 3, 3, 3, 5, 5, 5, 1, 8};

        Map<Integer, Integer> map = new HashMap<>();

        for (int element : array) {
            //map.containskey ka mtlb hai check krna ki abhi map mei wo element hai ya ni
            if(map.containsKey(element)) {
                //map.get(element) mei hamne jo key di hai is case mei element
                //us key ke corresponding jo value hai wo hame milegi
                //sbse pehle array mei check hoga ki 1 hai ya ni
                //1 nahi hoga to else mei aaega jisse map.put(1, 1) hga
                //2 nahi hoga to else mei aaega jisse map.put(2, 1) hga
                //3 nahi hoga to else mei aaega jisse map.put(3, 1) hga
                //1 hai to previousvalue = map.get(1) = 1
                //map.put(1, 2) aise hi map.put ki value change hti rhegi
                int previousValue = map.get(element);
                map.put(element, previousValue + 1);
            } else {
                map.put(element, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " came " + entry.getValue() + " times");
        }

        System.out.println(map.size());
    }
}
