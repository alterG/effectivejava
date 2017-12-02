package sort.bubble;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sort.Sortable;
import sort.insertion.InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest{
    public static final int ARR_LENGTH = 50;
    private int[] arr = new int[ARR_LENGTH];
    private int[] expectedArr = new int[ARR_LENGTH];
//    private Sortable sortObj = new BubbleSort();
    private Sortable sortObj = new InsertionSort();

    @Before
    public void init() {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
        }
        expectedArr = Arrays.copyOf(arr, arr.length);
//        System.arraycopy(arr, 0, expectedArr, 0, arr.length);
        Arrays.sort(expectedArr);
    }

    @Test
    public void sort() {
        sortObj.sort(arr);
        Assert.assertArrayEquals(expectedArr, arr);
    }
}