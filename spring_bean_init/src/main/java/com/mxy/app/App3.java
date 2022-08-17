package com.mxy.app;

import com.mxy.bean.Cat;
import com.mxy.bean.Dog;
import com.mxy.config.SpringConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author mxy
 * @version 1.0
 * @description: TODO
 * @date 2022/8/15 20:15
 */
public class App3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig1.class);
//        ctx.registerBean("catByRegister", Cat.class);
        String[] names = ctx.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
