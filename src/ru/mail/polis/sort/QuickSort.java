package ru.mail.polis.sort;

/**
 * Created by mmishak on 21/11/16.
 */
public class QuickSort {

    private static int partition(int[] a, int left, int right) {
        int p = a[left + (right - left + 1) / 2];
        int i = left, j = right;
        while (i <= j) {
            while (a[i] < p) i++;
            while (a[j] > p) j--;
            if (i <= j) Helper.swap(a, i++, j--);
        }
        return j;
    }

    private static void qsort(int[] a, int left, int right) {
        if (left >= right) return;
        int idx = partition(a, left, right);
        qsort(a, left, idx);
        qsort(a, idx + 1, right);
    }

    public static int[] sort(int[] a) {
        qsort(a, 0, a.length - 1);
        return a;
    }
}
