package com.lqw.sort.nlogn;

import com.lqw.sort.Sortable;

/**
 * 归并排序
 * 通过分治法将集合不断拆分，直到无法再拆分为止。
 * 然后将拆分的两个集合按顺序排序并合并成一个有序集合，不断合并，最终合并成完整的有序集合
 * 使用递归方法实现
 *
 *
 * 最好时间复杂度:O(n*logn),
 * 最坏时间复杂度:O(n*logn)
 * 最好时间复杂度:O(n*logn)
 *
 *
 T(n) = 2*T(n/2) + n
 = 2*(2*T(n/4) + n/2) + n = 4*T(n/4) + 2*n
 = 4*(2*T(n/8) + n/4) + 2*n = 8*T(n/8) + 3*n
 = 8*(2*T(n/16) + n/8) + 3*n = 16*T(n/16) + 4*n
 ......
 = 2^k * T(n/2^k) + k * n

 当 T(n/2^k)=T(1) 时，也就是 n/2^k=1，我们得到 k=log2n 。我们将 k 值代入上面的公式，得到 T(n)=Cn+nlog2n
 */
public class MergeSort implements Sortable {

    @Override
    public void sort(int[] arr) {
        merge_sort(arr,0,arr.length-1);
    }


    /**
     * 合并排序
     * @param arr 排序数组
     * @param start 起始位置
     * @param end 终点位置
     * @return
     */
    private void merge_sort(int[] arr, int start, int end){
        if (start>=end){
            return;
        }

        int midIndex=(start+end)/2;

        merge_sort(arr,start,midIndex);

        merge_sort(arr,midIndex+1,end);

        merge(arr,start,midIndex,end);
    }

    /**
     * 按顺序合并
     * @param arr
     * @param start
     * @param mid
     * @param end
     */
    private void merge(int[] arr,int start,int mid,int end){
        int[] copy=new int[end-start+1];

        int left=start,right=mid+1,copyIndex=0;
        while (left<=mid || right<=end){
            if(left==mid+1){
                copy[copyIndex++]=arr[right];
                right++;
            }else if(right==end+1){
                copy[copyIndex++]=arr[left];
                left++;
            }
            else if (arr[left]<arr[right]){
                copy[copyIndex++]=arr[left];
                left++;
            }else {
                copy[copyIndex++]=arr[right];
                right++;
            }
        }

        for (int i = 0; i < copy.length; i++) {
            arr[start+i]=copy[i];
        }

        print(arr);
    }

}
