package hashset;

import java.util.HashSet;
import java.util.Set;

public class DistinctElements {
    public static void main(String[] args) {

        int[] a = {5, 10, 15, 4, 6};
        int[] b = {10, 15, 4, 5};
        System.out.println(countDistinct(a));
        System.out.println(union(a, b));
        intersection(a, b);
    }

    public static Set<Integer> countDistinct(int[] a) {

        // O(n)
        Set<Integer> set = new HashSet<>();
        for (int element : a) {
            set.add(element);
        }

        return set;
    }

    public static Set<Integer> union(int [] a, int [] b) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int element : b) {
            set.add(element);
        }
        return set;
    }

    public static void intersection(int [] a, int [] b) {
        Set<Integer> set = new HashSet<>();

        for (int element: a) {
            set.add(element);
        }

        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                System.out.print(b[i] + " ");
            }
        }

    }
}
