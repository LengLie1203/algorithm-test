package com.lqw.stack;

import com.lqw.util.LoopUtil;
import org.junit.Before;
import org.junit.Test;

public class BrowserHistoryTest {

    public static final BrowserHistory bh = new BrowserHistory();
    public static final int size = 5;

    /**
     * 这个方法会在每个测试方法执行之前执行一次
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        bh.clean();
        for (int i = 0; i < size; i++) {
            bh.viewNew(String.valueOf((char)(65+i)));
        }
    }

    @Test
    public void loopAll() {

        LoopUtil.foreach(size,bh::getHistory);

        LoopUtil.foreach(size,bh::getHead);
    }

    @Test
    public void test() {

        System.out.println(bh.getHistory());
        System.out.println(bh.getHistory());
        bh.viewNew("F");

        System.out.println(bh.getHistory());
        System.out.println(bh.getHistory());

    }
}