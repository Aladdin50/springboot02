package com.mxy.app;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author mxy
 * @version 1.0
 * @description: TODO
 * @date 2022/8/15 21:18
 */
public class MyImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.mxy.bean.Cat"};
    }
}
