package com.lqw;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class MyTest {
    private Logger logger= LoggerFactory.getLogger(MyTest.class);
    public static void main(String[] args) {

    }

    @Test
    public void name() {
        StringBuilder x = new StringBuilder("name");

        change(x);

        logger.info(x.toString());

    }

    public void  change(StringBuilder x){
        x.append("LLL")
                ;
        x=new StringBuilder("change");
    }

    @Test
    public void ssss() {
        String num= "17145004032";
        BigDecimal bigDecimal = new BigDecimal(num);
        BigDecimal big = BigDecimal.valueOf(1024);
        for (int i = 0; i < 3; i++) {
            bigDecimal = bigDecimal.divide(big);
        }
        System.out.printf(bigDecimal.doubleValue()+"");
    }
}
