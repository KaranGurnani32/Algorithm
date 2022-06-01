package array;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {3, 9, 12, 13, 14, 19};
        int[] nums2 = {7, 17, 20, 24, 26, 28, 30, 32};

//        double median = findMedianSortedArrays(nums1, nums2);

        double median = find(nums1, nums2);
        System.out.println(median);
    }

    // Naive solution T - O((n + m) log(n + m))
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        double[] array = new double[m + n];
        int c = 0;
        for (int i = 0; i < m; i++) {
            array[i] = nums1[i];
            c++;
        }
        for (int i = 0; i < n; i++) {
            array[c++] = nums2[i];
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        double median = 0;
        if (array.length % 2 != 0) {
            int mid = array.length / 2;
            median = array[mid];
        } else {
            double mid1 = array.length / 2; // 2
            double mid2 = (array.length / 2) - 1; // 1
            median = (array[(int) mid1] + array[(int) mid2]) / 2;
        }

        return median;
    }

    // Another soln T - O(n + m) S - O(n + m)
    public static double find(int[] array1, int[] array2) {

        int len = array1.length + array2.length;
        int[] merged = new int[len];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                merged[k] = array1[i];
                i++;
            } else {
                merged[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < array1.length) {
            merged[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            merged[k] = array2[j];
            j++;
            k++;
        }

        double median = 0.0;
        int mid = merged.length / 2;
        if (merged.length % 2 == 1) {
            median = merged[mid];
        } else {
            median = (merged[mid] + merged[mid - 1]) / 2.0;
        }

        return median;
    }

    // Efficient Soln
//    public static double findingMedian(int[] a, int[] b) {
//
//        int low = 0;
//        int high = a.length;
//        int totalElements = a.length + b.length;
//
//        while (low <= high) {
//            int aleft = (low + high) / 2;
//            int bleft = (totalElements + 1) / 2 - aleft;
//            double median = 0.0;
//
//            // valid segregation
//            if (a[aleft - 1] <= b[bleft] && b[bleft - 1] <= a[aleft]) {
//
//                if (totalElements % 2 == 0) {
//                    int lmax = Math.max(a[aleft - 1], b[bleft - 1]);
//                    int rmin = Math.min(a[aleft], b[bleft]);
//                    median = (lmax + rmin) / 2.0;
//                } else {
//                    median = Math.max(a[aleft - 1], b[bleft - 1]);
//                }
//                return median;
//            } else if (a[aleft - 1] > b[bleft]) {
//                high = aleft - 1;
//            } else if (b[bleft - 1] > a[aleft]) {
//                low = aleft + 1;
//            }
//
//            return median;
//        }
//    }
}

