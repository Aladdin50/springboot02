package com.mxy.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mxy
 * @version 1.0
 * @description: TODO
 * @date 2022/8/15 16:01
 */
@Configuration
public class Mouse {
    @Bean
    public Mouse getMouse(){
        Mouse mouse = new Mouse();
        return mouse;
    }
}
