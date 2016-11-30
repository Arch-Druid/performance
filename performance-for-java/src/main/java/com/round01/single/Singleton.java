package com.round01.single;

/**
 * Created by yupeng on 29/11/2016.
 */
public class Singleton {
    private Singleton() {
        System.out.println("Singleton is create");
    }

//    private static Singleton instance = new Singleton();

    static {
        System.out.println("这是一个静态块");
    }

    {
        System.out.println("这是一个对象块");
    }

//    public static Singleton getInstance() {
//        return instance;
//    }

    public static void createString() {
        System.out.println("createString in Singleton");
    }

    public static void main(String[] args) {
        Singleton singleton = new Singleton();
    }
}
