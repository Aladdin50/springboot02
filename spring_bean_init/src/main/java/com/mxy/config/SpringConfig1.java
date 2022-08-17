package com.mxy.config;

import com.mxy.app.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author mxy
 * @version 1.0
 * @description: TODO
 * @date 2022/8/15 17:00
 */
//@ComponentScan("com.mxy")
@Import(MyImportSelector.class)
public class SpringConfig1 {
}
