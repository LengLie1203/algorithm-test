package com.lqw.sort;

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
        //选择的元素最终的下标
        int pi = start;

        for (int j = start; j < end; j++) {
            if (arr[j] < arr[end]) {
                int temp = arr[pi];
                arr[pi] = arr[j];
                arr[j] = temp;
                pi++;
            }
        }
        //将选择的元素放到排好序的位置
        int temp=arr[pi];
        arr[pi]=arr[end];
        arr[end]=temp;

        return pi;
    }
}
