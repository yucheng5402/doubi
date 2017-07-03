package com.zhidi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(value={ElementType.TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface table {
public String name () default "ะกร๗";
public int  age() default 22;
public int id() default  001;
public int[] a() default {3,2};
public String value();




}
