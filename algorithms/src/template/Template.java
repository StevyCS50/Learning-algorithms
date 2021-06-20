package template;

import algorithms.*;

public class Template {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        //Вывод массива в одной строке.
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        //Проверка упорядоченности элементов массива
        for(int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Comparable[] array = {5, 4, 2, 6, 1, 8, 9};
        //Тест сортировки
        for (Comparable comparable: array) {
            System.out.print(comparable + " ");
        }
    }
}
