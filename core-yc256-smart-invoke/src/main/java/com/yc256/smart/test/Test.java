package com.yc256.smart.test;

import com.yc256.smart.api.Greet;
import com.yc256.smart.api.GreetImpl;
import com.yc256.smart.proxy.SmartProxy;
import com.yc256.smart.proxy.SmartProxyFactory;

/**
 *
 * Created by hzzjb on 2016/11/17.
 */
public class Test {
    public static void main(String[] args) {
        SmartProxy smartProxy = new SmartProxy<GreetImpl>(GreetImpl.class);
        Greet greet = new SmartProxyFactory<Greet>(Greet.class).getInstance(smartProxy);
        greet.sayHello("smart");
    }
}
