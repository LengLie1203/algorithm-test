package com.lqw.queue;

/**
 * 数组队列
 *
 * @param <T>
 */
public class ArrayQueue<T> {

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

    public ArrayQueue() {
        this(16);
    }

    public ArrayQueue(int size) {
        this.size = size;
        datas = new Object[size];
    }

    /**
     * 入队
     *
     * @param data
     * @return
     */
    public boolean enQueue(T data) {
        //队列满了，不能再保存数据
        if (tail == size) {
            if (head > 0) {
                //第一种情况，队列全满，不能再加入数据
                return false;
            }

            //第二种情况，队首存在空间，需要将数据迁移到队首
            for (int i = head; i < tail; i++) {
                datas[i - head] = datas[i];
            }
            tail = tail - head;
            head = 0;

        }
        datas[tail] = data;
        ++tail;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public T deQueue() {
        if (head == tail) {
            return null;
        }
        return (T) datas[head++];
    }
}
