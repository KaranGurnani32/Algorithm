package Week1QuestionsPractice;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
    public static void main(String[] args) {
        int [] a = {1, 3, 4, 5, 7};
        int [] b = {2, 4, 6, 7, 8, 10};

        Object [] union = union(a, b);
        Object [] intersection = intersection(a, b);

        printArray2(union);
        printArray2(intersection);
    }

    private static Object[] intersection(int[] arrray1, int[] array2) {
        Set<Integer> karan = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int i = 0; i < arrray1.length; i++) {
            karan.add(arrray1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            if (karan.contains(array2[i])){
                intersection.add(array2[i]);
            }
        }
        return intersection.toArray();
    }

    private static Object[] union(int[] array1, int[] array2) {
        Set<Integer> karan = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            karan.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            karan.add(array2[i]);
        }
        return karan.toArray();
    }

    private static void printArray2(Object[] array) {
        System.out.println("-----------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-----------");

    }
}
