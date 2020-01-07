package com.lqw.linked;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * 链表中环的检测
 */
public class LinkedCircle {

    public static final Logger LOGGER = LoggerFactory.getLogger(LinkedCircle.class);

    public static void main(String[] args) {
        //创建链表
        OwnWayLinked<String> ownWayLinked = CreateLinkedUtil.createOwnWayLinked();

        //头尾相连，做成环
        OwnWayLinked.Node<String> last = ownWayLinked.getLast();
        last.setNext(ownWayLinked.getHead());
        //输出链表，证明这个是环
        foreach(ownWayLinked.getHead(), 20);

        //判断是否有环
        isCircle(ownWayLinked);
    }

    /**
     * 判断是否有环，
     * 定义两个节点，都从头节点开始，一个节点每次向前走两步，另一个节点每次向前走一步
     * 如果链表中有环的话，快节点会追上慢节点，两个节点相等
     */
    public static boolean isCircle(OwnWayLinked linked){
        OwnWayLinked.Node quickNode= linked.getHead();
        OwnWayLinked.Node slowNode = linked.getHead();
        if(slowNode==null){
            return false;
        }
        //如果没环会停止，有环至少会在最后一个节点相遇
        for (int i = 0; i < linked.size(); i++) {
            //慢节点一次走一步
            slowNode = slowNode.getNext();
            if(slowNode==null){
                return false;
            }
            //快节点一次走两步
            quickNode= Optional.ofNullable(quickNode.getNext()).orElseGet(OwnWayLinked.Node::new).getNext();
            if(quickNode==null){
                return false;
            }
            if(slowNode==quickNode){
                LOGGER.info("node is {}",quickNode.getData());
                return true;
            }
        }

        return false;
    }

    public static void foreach(OwnWayLinked.Node currentNode, int time) {
        int i = 0;
        //下面进行遍历
        while (currentNode != null && i < time) {
            LOGGER.info(currentNode.getData().toString());
            currentNode = currentNode.getNext();
            i++;
        }

    }
}
