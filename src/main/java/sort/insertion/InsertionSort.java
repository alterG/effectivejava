package sort.insertion;

import sort.Sortable;

/**
 * Complexity O(N^2), footprint O(1)
 */
public class InsertionSort implements Sortable{

    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > temp) {
                    a[j] = a[j - 1];
                    j--;
            }
            a[j] = temp;
        }
    }
}
