package com.lqw.sort.nn;

import com.lqw.sort.Sortable;

/**
 * 插入排序
 * 向一个有序集合中插入一个元素，插入后这个集合还是有序的。
 * 集合分为两部分：已排序部分，未排序部分；每次从未排序部分获取一个元素，将它放入到已排序部分的合适位置
 *
 *
 * 最好时间复杂度:O(n);完全有序时，未排序的元素每次只和有序部分判断一次。
 * 最坏时间复杂度:O(n*n)
 * 最好时间复杂度:O(n*n)
 */
public class InsertSort implements Sortable {

    public void sort(int[] arr) {

        //从下标1开始计算
        for (int i = 1; i < arr.length; i++) {
            int insertV=arr[i];
            int j = i-1;
            for (; j >=0; j--) {
                if(insertV<arr[j]){
                   arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[++j]=insertV;
            print(arr);
        }
    }
}
