package com.lqw.sort;

import com.lqw.sort.nlogn.MergeSort;
import com.lqw.sort.nlogn.QuickSort;
import com.lqw.sort.nn.BubbleSort;
import com.lqw.sort.nn.InsertSort;
import com.lqw.sort.nn.SelectSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortTest {

    private static int[] arr=new int[20];


    @Before
    public void setUp() throws Exception {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr.length-i;
        }
        System.out.print("原数组:");
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println();
        System.out.print("新数组:");
        for (int i : arr) {
            System.out.print(i+",");
        }
    }

    @Test
    public void bubbleSortTest() {

        Sortable sortable = new BubbleSort();

        sortable.sort(arr);

    }

    @Test
    public void insertSortTest() {
        Sortable sortable = new InsertSort();

        sortable.sort(arr);


    }

    @Test
    public void selectSortTest() {
        Sortable sortable = new SelectSort();

        sortable.sort(arr);

    }

    @Test
    public void mergeSortTest() {

        Sortable sortable = new MergeSort();

        sortable.sort(arr);
    }

    @Test
    public void quickSortTest() {

        Sortable sortable = new QuickSort();

        sortable.sort(arr);
    }
}