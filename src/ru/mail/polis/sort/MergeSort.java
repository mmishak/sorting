package ru.mail.polis.sort;

/**
 * Created by mmishak on 21/11/16.
 */
public class MergeSort {

    public static int[] sort(int[] a){

        for (int len = 1; len < a.length; len *= 2)
            for (int left = 0; left < a.length - len; left += len + len)
                merge(a, left, left + len, Math.min(left + len + len, a.length));

        return a;
    }

    private static void merge(int[] a, int left, int mid, int right) {

        int it1 = 0;
        int it2 = 0;

        int[] res = new int[right-left];

        while (left + it1 < mid && mid + it2 < right) {

            if (a[left + it1] <= a[mid + it2]) {

                res[it1 + it2] = a[left+it1];;
                it1 += 1;

            } else {

                res[it1 + it2] = a[mid + it2];
                it2 += 1;
            }
        }

        while (left + it1 < mid) {
            res[it1 + it2] = a[left + it1];
            it1 += 1;
        }

        while (mid + it2 < right) {
            res[it1 + it2] = a[mid + it2];
            it2 += 1;
        }

        for (int i = 0; i < it1 + it2; i++) {
            a[left + i] = res[i];
        }
    }
}
