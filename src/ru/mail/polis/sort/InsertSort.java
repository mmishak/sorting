package ru.mail.polis.sort;

/**
 * Created by mmishak on 21/11/16.
 */
public class InsertSort {

    public static int[] sort(int[] a) {

        for (int i = 0; i < a.length ; i++) {
            int j = i - 1;
            while (j >= 0 && a[j] > a[j + 1]) {
                Helper.swap(a, j, j + 1);
                j--;
            }
        }

        return a;
    }
}
