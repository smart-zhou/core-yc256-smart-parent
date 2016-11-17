package com.yc256.smart.proxy;

import java.lang.reflect.Proxy;

/**
 * SmartProxyFactory
 *
 * @author hzzjb
 * @date 2016/11/17
 */
public class SmartProxyFactory<T> {
    private final Class<T> smartInterface;

    public SmartProxyFactory(Class<T> smartInterface) {
        this.smartInterface = smartInterface;
    }

    @SuppressWarnings("unchecked")
    public T getInstance(SmartProxy smartProxy) {
        return (T) Proxy.newProxyInstance(smartInterface.getClassLoader(), new Class[] {smartInterface}, smartProxy);
    }
}
