package com.lqw.queue;

import com.lqw.util.LoopUtil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {

    @Test
    public void foreach() {
        ArrayQueue<String> arrayQueue=new ArrayQueue<>();
        for (int i = 0; i < 16; i++) {
            arrayQueue.enQueue(i+"");
        }
        LoopUtil.foreach(16,arrayQueue::deQueue);
    }

    @Test
    public void enQueue() {
        ArrayQueue<String> arrayQueue=new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            arrayQueue.enQueue(i+"");
        }

        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println("**************************");
        for (int i = 0; i < 8; i++) {
            arrayQueue.enQueue(i+"");
        }

        LoopUtil.foreach(16,arrayQueue::deQueue);
    }
}