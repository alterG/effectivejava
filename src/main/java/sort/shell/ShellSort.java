package sort.shell;

import sort.Sortable;

public class ShellSort implements Sortable {

    @Override
    public void sort(int[] a) {

        int h = 1;
        while (h <= a.length / 3) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            for (int i = h; i < a.length; i++) {
                int temp = a[i];
                int j = i;
                while (j >= h && a[j - h] >= temp) {
                    a[j] = a[j - h];
                    j -= h;
                }
                a[j] = temp;
            }
            h = (h-1)/3;
        }
    }
}
