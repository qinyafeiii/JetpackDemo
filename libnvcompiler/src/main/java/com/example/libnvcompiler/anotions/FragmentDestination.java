package com.example.libnvcompiler.anotions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface FragmentDestination {

    String pageUrl() default "";

    boolean needLogin() default  false;

    boolean asStart() default  false;


}
