package greedy;

import java.util.HashMap;
import java.util.Map;

public class GridTravel {
    static Map<String, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        memo.put("(1,1)", 1L);
        long n = 15;
        long m = 15;
        System.out.println(gridTravelRecursive(n, m));
    }

    private static long gridTravel(long n, long m) {
        String key = "(" + n + "," + m + ")";
        if(memo.containsKey(key)) {
            return memo.get(key);
        } else {
            if (n == 0 || m == 0) {
                memo.put(key, 0L);
                return 0;
            }
            long value = gridTravel(n - 1, m) + gridTravel(n, m-1);
            memo.put(key, value);
            return memo.get(key);
        }
    }


    private static long gridTravelRecursive(long n, long m) {
        if(n == 1 && m == 1) {
            return 1;
        } else if (n == 0 || m == 0) {
            return 0;
        }

        return gridTravelRecursive(n-1, m) + gridTravelRecursive(n, m-1);
    }
}
