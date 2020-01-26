package com.lqw.recursive;

import java.util.HashMap;
import java.util.Map;

/**
 * 杨辉三角的递归实现
 */
public class YangHuiSanJiao {

    public static int  count=0;

    public static final Map<String,Integer> f=new HashMap<>();

    /**
     * 返回第row行的第num个位置的值
     * 这个值等于(row-1)行的第(num-1)个值 + (row-1)行的第(num)个值
     * 当数字位于第一个或最后一个的时候，则为1
     * @param row 第几行
     * @param num 第几个数
     */
    public static int getValue(int row,int num){
        count++;
        if(num==1 || row==num){
            return 1;
        }
        String key = row + "_" + num;
        if(f.containsKey(key)){
            return f.get(key);
        }
        f.put(key,getValue(row-1,num)+getValue(row-1,num-1));

        return f.get(key);
    }

    public static void main(String[] args) {
        int row=10;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(getValue(i,j)+",");
            }
            System.out.println("");
        }
        System.out.println(count);
        
    }
}
