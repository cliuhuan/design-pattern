package com.liuhuan.study.design.structural.proxy.cglib;

public class Client {

    public static void main(String[] args) {
        //����Ŀ�����
        EnglishTeacher target = new EnglishTeacher();
        //��ȡ��������󣬲��ҽ�Ŀ����󴫵ݸ��������
        EnglishTeacher proxyInstance = (EnglishTeacher)new ProxyFactory(target).getProxyInstance();

        //ִ�д������ķ���������intecept �������Ӷ�ʵ�� ��Ŀ�����ĵ���
        String res = proxyInstance.teach();
        System.out.println("res=" + res);
    }

}
