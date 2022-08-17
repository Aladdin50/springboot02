package com.mxy.app;

import com.mxy.config.SpringConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mxy
 * @version 1.0
 * @description: TODO
 * @date 2022/8/15 16:10
 */
public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig1.class);
        Object mouse = ctx.getBean("mouse");
        System.out.println(mouse);
    }
}
