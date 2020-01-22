package com.lqw.stack;

import java.util.NoSuchElementException;

/**
 * 数据结构-栈
 * @param <T>
 */
public class Stack<T> {

    /**
     * 存储结构
     */
    private Object[] data;

    /**
     * 存储对象数量
     */
    private int count;

    /**
     * 存储结构大小
     */
    private int size;

    public Stack() {
        this(16);
    }

    public Stack(int size) {
        data= new Object[size];
        this.count=0;
        this.size = size;
    }

    public int count(){
        return this.count;
    }
    /**
     * 数据压入栈
     * @param element
     * @param <T>
     */
    public <T> void push(T element){
        if(count<size){
            data[count]=element;
            count++;
        }else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * 数据弹出栈
     * @return
     */
    public T pop(){
        if (count<=0){
            throw new NoSuchElementException();
        }
        count--;
        return (T) data[count];
    }

    /**
     * 清除数据，逻辑清除
     */
    public void clean(){
        count=0;
    }
}
