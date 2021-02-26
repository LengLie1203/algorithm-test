package com.lqw.sort;

public interface Sortable {

    public void sort(int[] arr);

    default void print(int[] arr){
        System.out.println();
        for (int i : arr) {
            System.out.print(i+",");
        }
    }
}
