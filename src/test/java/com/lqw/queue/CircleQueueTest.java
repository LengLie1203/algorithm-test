package com.lqw.queue;

import com.lqw.util.LoopUtil;
import org.junit.Assert;
import org.junit.Test;

public class CircleQueueTest {

    @Test
    public void foreach() {
        CircleQueue<String> circleQueue=new CircleQueue<>();
        for (int i = 0; i < 20; i++) {

            circleQueue.enQueue(i+"");
        }
        Assert.assertEquals("0", circleQueue.deQueue());
    }

    @Test
    public void enQueue() {
        CircleQueue<String> circleQueue=new CircleQueue<>();
        for (int i = 0; i < 10; i++) {

            circleQueue.enQueue(i+"");
        }
        LoopUtil.foreach(5,circleQueue::deQueue);
        System.out.println("/---------------");
        for (int i = 10; i < 30; i++) {

            circleQueue.enQueue(i+"");
        }

        Assert.assertEquals("5",circleQueue.deQueue());
    }
}