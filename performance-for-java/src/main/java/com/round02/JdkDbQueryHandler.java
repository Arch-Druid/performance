package com.round02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yupeng on 29/11/2016.
 */
public class JdkDbQueryHandler implements InvocationHandler {
    IDBQuery real = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (real == null) {
            real = new DBQuery();
        }
        return real.request();
    }


    public static IDBQuery createJdkProxy() {
        IDBQuery jdkProxy = (IDBQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IDBQuery.class}, new JdkDbQueryHandler());
        return jdkProxy;
    }


    public static void main(String[] args) {
        System.out.println(JdkDbQueryHandler.createJdkProxy().request());
    }

}
