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

    private static int[] arr={55,43,2,53,6,11,21,44,9};


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
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