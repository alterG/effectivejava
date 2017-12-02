package sort.merge;

import sort.Sortable;

public class MergeSort implements Sortable {
    int[] workspace;

    @Override
    public void sort(int a[]) {
        workspace = new int[a.length];
        recMergeSort(a, 0, a.length - 1);
    }

    public void recMergeSort(int[] a, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        }
        int mid = (lowerBound + upperBound) / 2;
        recMergeSort(a, lowerBound, mid);
        recMergeSort(a, mid + 1, upperBound);
        merge(a, lowerBound, mid + 1, upperBound);
    }

    public void merge(int[] a, int lowPtr, int highPtr, int upperBound) {
        int workloadIndex = 0;
        int lowerBound = lowPtr;
        int bottomBound = highPtr - 1;
        int size = upperBound - lowPtr + 1;

        while (lowPtr <= bottomBound && highPtr <= upperBound) {
            if (a[lowPtr] < a[highPtr]) {
                workspace[workloadIndex++] = a[lowPtr++];
            } else {
                workspace[workloadIndex++] = a[highPtr++];
            }
        }
        while (lowPtr <= bottomBound) {
            workspace[workloadIndex++] = a[lowPtr++];
        }

        while (highPtr <= upperBound) {
            workspace[workloadIndex++] = a[highPtr++];
        }
        for (int i = 0; i < size; i++) {
            a[lowerBound + i] = workspace[i];
        }
    }

}
