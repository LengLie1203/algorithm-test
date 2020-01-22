package com.lqw.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {


    @Test
    public void stackTest() {
        int size = 16;
        Stack<String> stringStack=new Stack<>(size);

        for (int i = 0; i < size; i++) {
            stringStack.push(i+"");
        }

        for (int i = 0; i < size; i++) {
            System.out.println("stringStack.pop() = " + stringStack.pop());
        }
    }

}