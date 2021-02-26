package com.lqw.sort.nn;

import com.lqw.sort.Sortable;

/**
 * 选择排序
 *
 * 和插入排序相似，分为有序部分和无序部分。
 * 每次从无序部分中选取最小的元素，将其放入到有序部分的末尾。
 *
 *
 * 最好时间复杂度:O(n*n);每次遍历都要选择最小的元素，需要重复遍历
 * 最坏时间复杂度:O(n*n)
 * 最好时间复杂度:O(n*n)
 */
public class SelectSort implements Sortable {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }

            int minValue=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=minValue;

            print(arr);
        }
    }
}
