package com.round02;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by yupeng on 29/11/2016.
 */
public class CglibDbQueryInterceptor implements MethodInterceptor {

    IDBQuery real = null;

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if (real == null) {
            real = new DBQuery();
        }
        return real.request();
    }

    public static IDBQuery createCglibProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new CglibDbQueryInterceptor());
        enhancer.setInterfaces(new Class[]{IDBQuery.class});
        IDBQuery cglibProxy = (IDBQuery) enhancer.create();
        return cglibProxy;
    }

    public static void main(String[] args) {
        System.out.println(CglibDbQueryInterceptor.createCglibProxy().request());
    }
}
