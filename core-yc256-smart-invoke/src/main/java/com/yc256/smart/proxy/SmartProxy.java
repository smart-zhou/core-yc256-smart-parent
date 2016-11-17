package com.yc256.smart.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * Created by hzzjb on 2016/11/17.
 */
public class SmartProxy<T> implements InvocationHandler {

    private final Class<T> proxyInterface;

    public SmartProxy(Class<T> proxyInterface) {
        this.proxyInterface = proxyInterface;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        try {
            if (Object.class.equals(method.getDeclaringClass())) {
                return method.invoke(this, args);
            }
            return method.invoke(proxyInterface.newInstance(), args);
        } finally {
            System.out.println("after invoke");
        }
    }
}
