package com.zhidi;

import java.lang.annotation.Annotation;

public class Student extends Person{
	
	public void study(){
		System.out.println("�Ұ�ϰ��ƽ");
	}
	
	public static void main(String[] args) {
		 Class<?> clz=Person.class;
		Annotation[]annotations= clz.getAnnotations();
		for (Annotation annotation1 : annotations) {
			System.out.println(annotation1);
		}
	}
}
