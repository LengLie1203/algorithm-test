package com.lqw.linked;

public class CreateLinkedUtil {

    public static final <E> OwnWayLinked<E> createOwnWayLinked(){
        OwnWayLinked ownWayLinked = new OwnWayLinked<>();
        ownWayLinked.add("0");
        ownWayLinked.add("1");
        ownWayLinked.add("2");
        ownWayLinked.add("3");
        ownWayLinked.add("4");
        ownWayLinked.add("5");
        ownWayLinked.add("6");
        ownWayLinked.add("7");
        ownWayLinked.add("8");
        ownWayLinked.add("9");
        return ownWayLinked;
    }
}
