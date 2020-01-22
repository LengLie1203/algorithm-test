package com.lqw.util;

import java.util.function.Supplier;

/**
 * 循环操作
 */
public class LoopUtil {

    public static void foreach(int time, Supplier<String> supplier){
        for (int i = 0; i < time; i++) {
            System.out.println(supplier.get());
        }
    }
}
