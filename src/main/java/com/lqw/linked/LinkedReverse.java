package com.lqw.linked;

/**
 * 单链表反转
 */
public class LinkedReverse {

    public static void main(String[] args) {
        OwnWayLinked<String> ownWayLinked =new OwnWayLinked<>();

        ownWayLinked.add("88");
        ownWayLinked.add("99");
        ownWayLinked.add("22");

        foreach(ownWayLinked);

        OwnWayLinked.Node<String> currentNode = ownWayLinked.getHead();
        //下面进行反转
        //fixme 反转失败了
        OwnWayLinked.Node<String> next = currentNode.getNext();
        //头节点改为尾节点，next是null
        currentNode.setNext(null);
        while (next!=null){
            //先拿到下一个节点
            OwnWayLinked.Node<String> nextNext = next.getNext();

            next.setNext(currentNode);

            next=nextNext;
        }

        foreach(ownWayLinked);
    }

    public static void foreach(OwnWayLinked<String> ownWayLinked) {
        OwnWayLinked.Node<String> currentNode = ownWayLinked.getHead();
        //下面进行遍历
        while (currentNode!=null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}
