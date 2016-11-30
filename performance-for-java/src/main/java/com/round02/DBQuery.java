package com.round02;

/**
 * Created by yupeng on 29/11/2016.
 */
public class DBQuery implements IDBQuery {
    @Override
    public String request() {
        return "request string";
    }

    public DBQuery() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
