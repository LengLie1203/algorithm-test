package com.lqw.algo;

/**
 * 计算股票最高交易收益
 */
public class StockPrice {

    public static void main(String[] args){

        double[] stockPrice={1, 1.1, 0.8,1.5,0.2,1.3};
        double maxReturn=0D;
        //假定卖出的日期固定，则最大收益应该是之前天中 最小数字与最大数字的差
        double minPrice=stockPrice[0];

        for(int i=0;i<stockPrice.length;i++){

            double todayReturn=stockPrice[i]-minPrice;
            if(maxReturn <todayReturn ){
                maxReturn=todayReturn;
            }

            //之前最小值大于今日的值，则把最小值改为今天的值
            if(minPrice>stockPrice[i]){
                minPrice=stockPrice[i];
            }


        }
        System.out.print(maxReturn);
    }

}