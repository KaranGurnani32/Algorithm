package Week1QuestionsPractice;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
    public static void main(String[] args) {
        //take an array
        int[] a = {5, 10, 5, 4, 5, 10};

//        int count = 1;
//        System.out.println("distinct = " + a[0]);
//        for (int i = 1; i < a.length; i++) {
//            int j;
//            for (j = 0; j < i; j++) {
//                //to check if the element already here or not
//                if (a[i] == a[j]) {
//                    System.out.println("already exists " + a[j]);
//                    break;
//                }
//            }
//
//            if (j == i) {
//                System.out.println("distinct = " + a[i]);
//                count++;
//            }
//        }
//        System.out.println("count = " + count);

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        System.out.println(set.size());
        System.out.println(set);
    }
}
