package com.zhidi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.FIELD,ElementType.METHOD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
public String name() default "name";
public String type() default "type";
public int length()  default  2;
public boolean unique()   default true;
}
