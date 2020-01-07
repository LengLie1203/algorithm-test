package com.lqw.linked;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;

/**
 * 自定义一个单向链表
 *
 * @param <T> 链表中存储的数据类型
 */
public class OwnWayLinked<T> implements Iterable<T> {
    private Logger logger= LoggerFactory.getLogger(OwnWayLinked.class);

    private Node<T> head;

    private Node<T> last;

    private int size;

    /**
     * 加入一个元素
     *
     * @param data 元素
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data, null);
        //最后一个节点为null，证明链表里面没有数据，所以从第一个开始存
        if (last == null) {
            head = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;
        size++;
    }

    public int size(){
        return size;
    }

    /**
     * 按照下标获取数据
     * @param index
     * @return
     */
    public T get(int index) {
        checkRange(index);
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;

    }

    public Node<T> getHead(){
        return head;
    }

    public Node<T> getLast(){
        return last;
    }

    private void checkRange(int index) {
        if (!inRange(index)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean inRange(int index) {
        return index >= 0 && index < size;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        //todo 怎么实现迭代器模式
        return null;
    }

    public void outputEach(){
        Node<T> hNode = this.head;
        for (int i = 0; i < size(); i++) {
            logger.info(hNode.getData().toString());
            hNode=hNode.getNext();
        }
    }

    /**
     * 链表中的节点对象
     *
     * @param <T>
     */
    public static class Node<T> {
        private T data;

        private Node<T> next;

        public Node() {
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
