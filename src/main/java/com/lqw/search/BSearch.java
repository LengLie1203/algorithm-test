package com.lqw.search;

/**
 * 二分查找
 */
public class BSearch {


    /**遍历方式
     * @param arr
     * @param v
     */
    public void bsearch(int[] arr, int v) {
        //定义头尾
        int low = 0, high = arr.length - 1;
        //下面的公式防止 low+high 溢出，并且位操作符更快
        int mid = low + ((high - low) >> 1);
        int count = 1;
        while (low <= high) {
            if (arr[mid] > v) {
                high = mid - 1;
            } else if (arr[mid] < v) {
                low = mid + 1;
            }else {
                break;
            }
            System.out.println("search times:" + count + ",mid value:" + arr[mid]);
            mid = low + ((high - low) >> 1);
            count++;
        }

        System.out.println("search times:" + count);
        if (arr[mid] != v) {
            System.out.println("NOOOOOOOOO");
        } else {
            System.out.println(arr[mid]);
        }
    }

    /**递归方式
     * @param arr
     * @param v
     */
    public void bsearch2(int[] arr, int v){
        search(arr,0,(arr.length-1),v);
    }

    public void search(int[] arr,int low,int high,int v){
        int mid=low+((high-low)>>1);
        //没找到
        if(low>high){
            System.out.println("NOOOOOOOOO");
            return;
        }
        if(arr[mid]==v){
            System.out.println(arr[mid]);
            return;
        }

        if(arr[mid]>v) {
            search(arr, low,mid-1,v);
        }else {
            search(arr, mid+1,high,v);
        }
    }

    public static void main(String[] args) {
        new BSearch().bsearch2(new int[]{1, 2, 3, 4, 5, 10, 12, 14, 44, 55, 66, 88}, 12);


    }
}
