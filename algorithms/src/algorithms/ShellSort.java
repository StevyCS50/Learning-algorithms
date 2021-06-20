package algorithms;

import static template.Template.*;

public class ShellSort {
    public static void shellSort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        while (h < n/3) {
            //1, 4, 13, 40, 121, 364, 1093.....
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                //Вставка a[i] между a[i - h], a[i - 2 * h], a[a - 3 * h]....
                for(int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
                h = h/3;
            }
        }
    }
}
