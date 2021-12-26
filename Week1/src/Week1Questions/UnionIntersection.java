package Week1Questions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionIntersection {

    public static void main(String[] args) {
        //union of two arrays and put that in another array
        //intersection of two arrays and put that in another array

        //a = {1 3 4 5 7}
        //b = {2 4 6 8 10 7}
        //union = { 1 2 3 4 5 6 7 10} {1 3 4 5 7 2 6 8 10}
        //intersection = {4 7}

        //set = {1 3 4 5 7}
        //intersection = {4 7}
        int [] a = {1, 3, 4, 5, 7};
        int [] b = {2, 4, 6, 7, 8, 10};

        Object[] union = union(a, b);
        Object[] intersection = intersection(a, b);

        printArray(a);
        printArray(b);
        printArray2(union);
        printArray2(intersection);

    }

    private static Object[] intersection(int[] a, int[] b) {
        //take a set
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        //add both the arrays in set
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            if(set.contains(b[i])) {
                intersection.add(b[i]);
            }
        }

       return intersection.toArray();
    }

    private static Object[] union(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        return set.toArray();
    }

    private static void printArray2(Object[] array) {
        System.out.println("-----------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-----------");

    }

    private static void printArray(int[] array) {
        System.out.println("-----------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-----------");

    }
}
