package com.lqw.linked;

public class CreateLinkedUtil {

    public static final <E> OwnWayLinked<E> createOwnWayLinked(){
        return createOwnWayLinked(10,1);
    }

    /**
     * @param size 链表数量
     * @param coefficient 数据的系数
     * @param <E> 数据类型
     * @return
     */
    public static final <E> OwnWayLinked<E> createOwnWayLinked(int size,int coefficient){
        OwnWayLinked ownWayLinked = new OwnWayLinked<>();
        for (int i = 0; i < size; i++) {
            ownWayLinked.add(i*coefficient);
        }
        return ownWayLinked;
    }
}
