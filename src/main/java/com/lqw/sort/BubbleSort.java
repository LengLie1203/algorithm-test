package com.lqw.sort;

/**
 * 冒泡排序,
 * 每一个元素都只和后面一个元素进行比较并进行排序（注意是只和后面一个元素，不会和其他元素）
 * 所以每一轮循环之后，都会将未排序重最大的元素排到对应位置。
 * 这个操作就像是冒泡一样，所以叫做冒泡排序
 *
 *
 * 最好时间复杂度:O(n);可以通过添加标记，如果某次遍历没有进行交换，则表明全部有序
 * 最坏时间复杂度:O(n*n)
 * 最好时间复杂度:O(n*n)
 */
public class BubbleSort implements Sortable{

    public void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean flag=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int n=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=n;

                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }

    }

}
