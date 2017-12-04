package sort.quick;

import sort.Sortable;
import sort.Utils;

public class QuickSort implements Sortable{

    @Override
    public void sort(int[] a) {
        recSort(a, 0, a.length-1);
    }

    private void recSort(int[] a, int left, int right) {
        if (left == right) return;
        int pivot = a[right];
        int rightArrayPtr = participate(a, left, right, pivot);
        recSort(a, left, rightArrayPtr - 1);
        recSort(a, rightArrayPtr + 1, right);
    }

    private int participate(int[] a, int left, int right, int pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (a[++leftPtr] < pivot) {}
            while (rightPtr > left && a[--rightPtr] > pivot) {}
            if (leftPtr == rightPtr) {
                break;
            } else {
                Utils.swap(a, left, right);
            }
        }
        Utils.swap(a, leftPtr, right);
        return leftPtr;
    }
}
