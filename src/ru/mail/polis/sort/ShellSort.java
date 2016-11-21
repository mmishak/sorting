package ru.mail.polis.sort;

/**
 * Created by mmishak on 21/11/16.
 */
public class ShellSort {

    public static int[] sort(int[] a) {

        int step = a.length / 2;
        while (step > 0)
        {
            for (int i = 0; i < (a.length - step); i++)
            {
                int j = i;
                while (j >= 0 && a[j] > a[j + step])
                {
                    Helper.swap(a, j, j + step);
                }
            }
            step = step / 2;
        }

        return a;
    }
}
