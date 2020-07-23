package com.liuhuan.study.design.structural.proxy.dynamic;

public class EnglishTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println(" ÀÏÊ¦ÊÚ¿ÎÖĞ.... ");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}

}
