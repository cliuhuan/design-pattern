package com.liuhuan.study.design.structural.proxy.cglib;

public class Client {

    public static void main(String[] args) {
        //创建目标对象
        EnglishTeacher target = new EnglishTeacher();
        //获取到代理对象，并且将目标对象传递给代理对象
        EnglishTeacher proxyInstance = (EnglishTeacher)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
        String res = proxyInstance.teach();
        System.out.println("res=" + res);
    }

}
