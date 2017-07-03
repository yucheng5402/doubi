package com.zhidi;

import java.lang.reflect.Method;

public class TestAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<?> clz=Person.class; 
		table t=clz.getAnnotation(table.class);
		System.out.println(t.name());
		System.out.println(t.age());
		System.out.println(t.value());
		
		Method method=clz.getMethod("getId", new Class[]{});
		if(method.isAnnotationPresent(Column.class)){
			Column id=method.getAnnotation(Column.class);
			String name=id.name();
			String type=id.type();
			int length=id.length();
			boolean unique=id.unique();
			System.out.println("����Ϊ��"+name+"  "+"����Ϊ:"+type+"   "+"����Ϊ:"+length+"  "+"�Ƿ�Ψһ:"+unique);
		}
	}

}
