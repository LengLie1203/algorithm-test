package com.lqw.queue;

/**
 * 环形队列
 * @param <T>
 */
public class CircleQueue<T> {

    private Object[] datas;

    /**
     * 队列容量
     */
    private int size;

    /**
     * 头节点下标
     */
    private int head;

    /**
     * 尾节点下标
     */
    private int tail;

    public CircleQueue() {
        this(16);
    }

    public CircleQueue(int size) {
        this.size = size;
        datas=new Object[size];
    }

    /**
     * 入队
     * @param data
     * @return
     */
    public boolean enQueue(T data){
        if ( (tail+1)%size==head){
            return false;
        }
        datas[tail]=data;
        tail=(tail+1)%size;
        return true;
    }

    /**
     * 出队
     * @return
     */
    public T deQueue(){
        if (head==tail){
            return null;
        }
        Object data = datas[head];
        head=(head+1)%size;
        return (T) data;
    }
}
