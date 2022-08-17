package com.mxy.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mxy
 * @version 1.0
 * @description: TODO
 * @date 2022/8/15 16:10
 */
public class App1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Object cat = ctx.getBean("cat");
        System.out.println(cat);
        System.out.println("hello git!");
        System.out.println("master commit");
    }
}
