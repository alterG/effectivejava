package sort.insertion;

import sort.Sortable;
import sort.Utils;

public class InsertionSort implements Sortable {

    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            Utils.swap(a, i, min);
        }
    }
}
