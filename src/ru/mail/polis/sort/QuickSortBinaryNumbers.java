package ru.mail.polis.sort;

/**
 * Created by mmishak on 21/11/16.
 */
public class QuickSortBinaryNumbers {

    public static char[] sort(char[] a){

        return a;
    }

    private static void quickSort(char[] a, int l, int r, int d){

        int i = l;
        int j = r;

        if (r <= l || d > 7)
            return;

        while (j != i)
        {
            while (Integer.valueOf(Integer.toBinaryString((int)a[i]).charAt(d)) == 0 && (i < j)) i++;
            while (Integer.valueOf(Integer.toBinaryString((int)a[j]).charAt(d)) == 1 && (j > i)) j--;
            exch(a, i, j);
        }
        if (bit(a[r], d) == 0) j++;
        quicksortB(a, l, j-1, d+1);
        quicksortB(a, j, r, d+1);
    }

    private static void swap(char[] a, int i, int j){
        char tmp = a[i];
        a[i] = a[]
    }
}
