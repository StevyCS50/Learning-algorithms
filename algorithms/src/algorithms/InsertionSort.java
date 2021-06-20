package algorithms;

import static template.Template.*;

public class InsertionSort {
    public static void insertSort(Comparable[] a) {
        //Сортировка по возрастанию
        int n = a.length;
        for (int i = 1; i < n; i++) {
            //Вставка a[i] среди a[i - 1], a[i - 2], a[i - 3], ...
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
