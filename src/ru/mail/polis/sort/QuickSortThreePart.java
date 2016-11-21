package ru.mail.polis.sort;

import java.util.Random;

/**
 * Created by mmishak on 21/11/16.
 */
public class QuickSortThreePart {

    public static int[] sort(int[] a) {
        qsort(a, 0, a.length - 1);
        return a;
    }

    private static void qsort(int[] arr, int b, int e)
    {
        int l = b, r = e;
        Random rnd = new Random();
        int index = l + rnd.nextInt(r - l + 1);
//        int piv = arr[(l + r) / 2]; // Опорным элементом для примера возьмём средний
        int piv = arr[index];
        while (l <= r)
        {
            while (arr[l] < piv)
                l++;
            while (arr[r] > piv)
                r--;
            if (l <= r) {
                Helper.swap(arr, l++, r--);
            }
        }
        if (b < r)
            qsort (arr, b, r);
        if (e > l)
            qsort (arr, l, e);
    }
}
