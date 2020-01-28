package com.lqw.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortTest {

    private static int[] arr = new int[100];


    @Before
    public void setUp() throws Exception {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length-i;
//            arr[i] = (int) (Math.random() * arr.length);
        }
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
}