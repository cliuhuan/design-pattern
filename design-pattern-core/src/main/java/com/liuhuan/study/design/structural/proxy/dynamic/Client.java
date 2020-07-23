package com.liuhuan.study.design.structural.proxy.dynamic;

public class Client {

    public static void main(String[] args) {
        //����Ŀ�����
        Teacher target = new EnglishTeacher();

        //��Ŀ����󣬴����������, ����ת�� Teacher
        Teacher proxyInstance = (Teacher)new ProxyFactory(target).getProxyInstance();

        // proxyInstance=class com.sun.proxy.$Proxy0 �ڴ��ж�̬�����˴������
        System.out.println("proxyInstance=" + proxyInstance.getClass());

        //ͨ��������󣬵���Ŀ�����ķ���
        proxyInstance.teach();

        proxyInstance.sayHello(" tom ");
    }

}
