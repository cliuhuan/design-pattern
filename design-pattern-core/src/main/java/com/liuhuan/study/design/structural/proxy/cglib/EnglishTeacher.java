package com.liuhuan.study.design.structural.proxy.cglib;

public class EnglishTeacher {

    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "hello";
    }
}
