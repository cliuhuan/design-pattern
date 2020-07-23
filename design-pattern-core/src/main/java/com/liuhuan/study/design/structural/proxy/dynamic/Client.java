package com.liuhuan.study.design.structural.proxy.dynamic;

public class Client {

    public static void main(String[] args) {
        //创建目标对象
        Teacher target = new EnglishTeacher();

        //给目标对象，创建代理对象, 可以转成 Teacher
        Teacher proxyInstance = (Teacher)new ProxyFactory(target).getProxyInstance();

        // proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance=" + proxyInstance.getClass());

        //通过代理对象，调用目标对象的方法
        proxyInstance.teach();

        proxyInstance.sayHello(" tom ");
    }

}
