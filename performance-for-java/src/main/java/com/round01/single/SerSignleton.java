package com.round01.single;

import java.io.Serializable;

/**
 * Created by yupeng on 29/11/2016.
 */
public class SerSignleton implements Serializable {
    String name;

    private SerSignleton() {
        System.out.println("Singleton is create");
        name = "SerSingleton";
    }

    private static SerSignleton instance = new SerSignleton();

    public static SerSignleton getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("createString in Singleton");
    }

    private Object readResolve() {
        return instance;
    }
}
