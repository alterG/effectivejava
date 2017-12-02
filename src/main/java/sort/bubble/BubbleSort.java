package sort.bubble;

import static sort.Utils.swap;

import sort.Sortable;

/**
 * Complexity O(N^2), memory footprint O(1)
 */
public class BubbleSort implements Sortable {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}
