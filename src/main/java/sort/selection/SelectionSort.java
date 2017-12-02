package sort.selection;

import sort.Sortable;
import sort.Utils;

/**
 * Complexity O(N^2), footprint O(1)
 */
public class SelectionSort implements Sortable {

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
