package com.lqw;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
}
