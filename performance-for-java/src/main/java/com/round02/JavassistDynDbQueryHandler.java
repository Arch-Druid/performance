package com.round02;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by yupeng on 29/11/2016.
 */
public class JavassistDynDbQueryHandler implements MethodInterceptor {
    IDBQuery real = null;

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if (real == null) {
            real = new DBQuery();
        }
        return real.request();

    }

    public static IDBQuery createJavassistDynProxy() {

    }
}
