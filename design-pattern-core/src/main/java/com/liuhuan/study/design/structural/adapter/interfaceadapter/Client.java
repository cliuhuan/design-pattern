package com.liuhuan.study.design.structural.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {

        AbsAdapter absAdapter = new AbsAdapter() {
            //ֻ��Ҫȥ�������� ��Ҫʹ�� �ӿڷ���
            @Override
            public void m1() {
                System.out.println("ʹ����m1�ķ���");
            }
        };

        absAdapter.m1();
    }
}
