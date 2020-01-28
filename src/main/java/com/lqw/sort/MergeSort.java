package com.lqw.sort;

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
        //数组只有一个元素，直接返回
        if (start>=end){
            return ;
        }
        //将数组分成两个子数组
        int mid=(start+end)/2;

        merge_sort(arr,start,mid);
        merge_sort(arr,mid+1,end);

        merge(arr,start,mid,end);
    }

    /**
     * 按顺序合并
     * @param arr
     * @param start
     * @param mid
     * @param end
     */
    private void merge(int[] arr,int start,int mid,int end){
        int[] copyArr=new int[end-start+1];
        int i=start,j=mid+1;
        int copyArrIndex=0;
        //todo 使用哨兵可以简化代码,创建左右两个临时数组，
        // 将数据原封不动添加进去，在两个数组末尾各添加一个哨兵。然后将两个数组的数据排序后复制到原始数组中。
        // 再遇到哨兵后，数组将不再前进，只需要循环 end-start+1次即可，不需要表两个数组下标了
        //比较两个最小的值，放到临时数组中
        while (i<=mid && j<=end) {
            if (arr[i] <= arr[j]) {
                copyArr[copyArrIndex++] = arr[i++];
            } else {
                copyArr[copyArrIndex++] = arr[j++];
            }
        }
        //判断哪个数组还剩数据，将剩余的数据全部复制到临时数组
        //初始化时，默认从左侧数组开始
        int from=i,to=mid;
        if(j<end){
            from=j;
            to=end;
        }
        for (int k = from; k <= to; k++) {
            copyArr[copyArrIndex++]=arr[k];
        }

        for (int i1 = 0; i1 < copyArr.length; i1++) {
            arr[start+i1]=copyArr[i1];
        }
    }

}
