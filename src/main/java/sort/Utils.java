package sort;

public class Utils {

    public static void swap(int[] a, int i, int j) {
        int buf = a[i];
        a[i] = a[j];
        a[j] = buf;
    }

}
