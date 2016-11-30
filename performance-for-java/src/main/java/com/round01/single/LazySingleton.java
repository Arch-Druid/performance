package com.round01.single;

/**
 * Created by yupeng on 29/11/2016.
 */
public class LazySingleton {

    private LazySingleton() {
        System.out.println("LazySingleton is create;");
    }

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }


    public static void main(String[] args) {
        LazySingleton instance = LazySingleton.getInstance();

    }


}
