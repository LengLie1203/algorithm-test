package com.lqw.linked;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单链表反转
 */
public class LinkedReverse {

    public static final  Logger LOGGER = LoggerFactory.getLogger(LinkedReverse.class);

    public static void main(String[] args) {
        OwnWayLinked<String> ownWayLinked =CreateLinkedUtil.createOwnWayLinked();

        foreach(ownWayLinked.getHead());

        OwnWayLinked.Node<String> currentNode = ownWayLinked.getHead();
        LOGGER.info("------------------------------------------------------------------------");
        //下面进行反转
        //记录当前节点为上一个节点
        OwnWayLinked.Node<String> prev=currentNode;
        //获取下一个节点
        currentNode = currentNode.getNext();
        //头节点改为尾节点，next是null
        prev.setNext(null);
        while (currentNode!=null){
            //先拿到下一个节点
            OwnWayLinked.Node<String> next = currentNode.getNext();
            currentNode.setNext(prev);
            prev=currentNode;
            currentNode=next;
        }

        foreach(ownWayLinked.getLast());
    }

    public static void foreach(OwnWayLinked.Node<String> currentNode ) {
        //下面进行遍历
        while (currentNode!=null){
            LOGGER.info(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}
