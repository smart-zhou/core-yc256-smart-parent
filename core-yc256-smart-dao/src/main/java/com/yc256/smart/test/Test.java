package com.yc256.smart.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Created by hzzjb on 2016/11/10.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("smart-ds.xml");
        applicationContext.start();
        while (true) {
            Thread.sleep(1000);
        }
    }
}
