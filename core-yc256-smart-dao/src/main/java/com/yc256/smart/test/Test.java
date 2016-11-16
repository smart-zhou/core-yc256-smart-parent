package com.yc256.smart.test;

import com.yc256.smart.dao.SmartMemberMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Created by hzzjb on 2016/11/10.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("smart-ds.xml");
        applicationContext.start();

        SmartMemberMapper mapper = applicationContext.getBean(SmartMemberMapper.class);
        mapper.selectByPrimaryKey(0);
    }
}
