package com.lqw.linked;

/**
 * 两个有序链表的合并
 */
public class MergeLinked {

    public static void main(String[] args) {
        //定义两个链表
        OwnWayLinked<Object> smallLinked = CreateLinkedUtil.createOwnWayLinked(10, 2);
        smallLinked.outputEach();
        OwnWayLinked<Object> bigLinked = CreateLinkedUtil.createOwnWayLinked(6, 3);
        bigLinked.outputEach();

        //
    }


}
