package com.example.libnvcompiler;


import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;

/**
 * 创建者:qinyafei
 * 创建时间: 2020/4/15
 * 描述:自定义注解处理器，用来处理编译时期的注解
 * 版本信息：1.0.0
 **/
public class NavProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return false;
    }
}
