package algorithms;


import static template.Template.*;

public class SelectionSort {

    public static void selectSort(Comparable[] a) {
        //Сортировка массива a[] по возрастанию
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
}

















