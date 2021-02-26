package com.lqw.sort.nlogn;

import com.lqw.sort.Sortable;

/**
 * 快速排序
 * 利用分治法：每次选择一个元素，循环比较数组中所有的元素，
 * 将小于所选元素的其他元素放在左侧，大于所选元素的其他元素放在右侧。
 * 然后将数组分为左右两个，通过递归重复执行，当数组长度为1时推出
 *
 *
 * 最好时间复杂度:O(n*logn)
 * 最坏时间复杂度:O(n^2)。快速排序需要选择一个元素作为标准，这个元素是随机的，无法将数组平均分为两段，最坏情况是每次元素都分配到一边
 * 最好时间复杂度:O(n*logn)
 */
public class QuickSort implements Sortable {

    @Override
    public void sort(int[] arr) {
        merge_sort(arr, 0, arr.length - 1);
    }

    private void merge_sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int index = partition(arr, start, end);
        //这里index-1是关键,index 表示选中的元素，他是排好序的，不能再改变
        merge_sort(arr, start, index-1);
        merge_sort(arr, index + 1, end);
    }


    /**
     * 分区，选择一个元素，将较小的元素放在数组左侧，元素在中间，较大的元素在右侧
     *
     * @param arr
     * @param start
     * @param end
     * @return 返回元素的下标
     */
    private int partition(int[] arr, int start, int end) {
        //初始化中位数下标，默认设置=start
       int realMidIndex=start;

       //使用某个值作为中位数,最简单的是取end上的值，
        // 因为从下面代码可以看出，end下标的数据是不会进入for循环 i<end，循环之后只需要将end下标和midIndex下标的数字换位置即可。
        //如果获取的中位数在for循环中改变位置了，则最终需要将 改变后的位置 和midIndex 中的数字交换。这个操作就很麻烦，在有重复的中位数时更难获取到
       int midValue=arr[end];
        for (int i = start; i < end; i++) {
            //某个下标上的数字小于中位数，则将这个数字放到现在的中位数下标上，中位数下标+1；
            // 这样就能保证所有小于中位数的数字都在左侧
            if (arr[i]<midValue){
                int v=arr[realMidIndex];
                arr[realMidIndex]=arr[i];
                arr[i]=v;
                realMidIndex++;
            }
        }
        int v=arr[realMidIndex];
        arr[realMidIndex]= midValue;
        arr[end]=v;

        return realMidIndex;
    }
}
