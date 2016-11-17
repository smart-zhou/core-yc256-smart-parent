package com.yc256.smart.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by hzzjb on 2016/11/17.
 */
public class TestProxy implements InvocationHandler {

    private Object obj;

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new TestProxy(obj));
    }

    private TestProxy(Object obj) {
        // Greet接口的實現：GreetImpl
        this.obj = obj;
    }

    // Method m：調用的方法
    // Object[] args：方法要傳入的參數
    // invoke实现对GreetImpl中方法的调用，同时也可以在这里加入自己想要实现的操作，
    // 虽然调用原GreetImpl中的方法重要，但我想这里更看重的是通过自定义处理实现GreetImpl中没有的功能
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        Object result;
        try {
            // 自定義的處理
            System.out.println("--before method " + m.getName());
            // 調用GreetImpl中方法
            result = m.invoke(obj, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        } finally {
            System.out.println("--after method " + m.getName());
        }
        return result;
    }
}
