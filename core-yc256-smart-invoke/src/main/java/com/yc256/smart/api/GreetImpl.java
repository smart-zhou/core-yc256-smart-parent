package com.yc256.smart.api;

/**
 * Created by hzzjb on 2016/11/17.
 */
public class GreetImpl implements Greet {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void goodBye() {
        System.out.println("Good bye.");
    }
}
