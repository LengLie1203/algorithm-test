package com.lqw.linked;

/**
 * 两个有序链表的合并
 * 一个一个节点合并，中间不会跳过节点
 */
public class MergeLinked_1 {

    public static void main(String[] args) {
        //定义两个链表
        OwnWayLinked<String> smallLinked = CreateLinkedUtil.createOwnWayLinked(10, 2);
        smallLinked.outputEach();
        OwnWayLinked<String> bigLinked = CreateLinkedUtil.createOwnWayLinked(6, 3);
        bigLinked.outputEach();

        //获取第一个链表的第一个节点
        OwnWayLinked.Node<String> firCurrNode = smallLinked.getHead();
        //获取第二个链表的第一个节点
        OwnWayLinked.Node<String> secCurrNode = bigLinked.getHead();
        //得到最小的节点
        OwnWayLinked.Node<String> minNode=Integer.parseInt(firCurrNode.getData())<Integer.parseInt(secCurrNode.getData())?firCurrNode:secCurrNode;

        while (firCurrNode != null && secCurrNode!=null) {
            System.out.println("firnode="+firCurrNode.getData()+" secNode="+secCurrNode.getData());
            //第一个链表的节点大于第二个链表的节点
            //fixme 如果两个节点相等的话，走上面的逻辑最终的链表会包含重复的，走下面的逻辑最终的链表不包含重复的。这个问题还要研究一下
            if (Integer.parseInt(firCurrNode.getData()) >= Integer.parseInt(secCurrNode.getData())) {
                //获取第二个链表的下一个节点
                OwnWayLinked.Node<String> next = secCurrNode.getNext();
                //第二个链表的当前节点加到第一个链表当前节点的前面
                secCurrNode.setNext(firCurrNode);
                //将第二个链表的前进一个节点
                secCurrNode=next;
            } else {
            //第一个链表的节点小于第二个链表的节点
                OwnWayLinked.Node<String> next = firCurrNode.getNext();
                firCurrNode.setNext(secCurrNode);
                firCurrNode=next;
            }
        }

        foreach(minNode);

    }

    public static void foreach(OwnWayLinked.Node node){
        while (node!=null){
            System.out.println(node.getData());
            node=node.getNext();
        }
    }
}
