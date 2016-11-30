package com.round02;

/**
 * Created by yupeng on 29/11/2016.
 */
public class DBQueryProxy implements IDBQuery {
    private DBQuery real = null;

    @Override
    public String request() {
        if (real == null)
            real = new DBQuery();
        return real.request();
    }
}
