package com.liuhuan.study.design.creational.factory.simple;

import com.liuhuan.study.design.creational.factory.simple.order.OrderPizza2;

public class PizzaStore {

    public static void main(String[] args) {
        //new OrderPizza();

        //ʹ�ü򵥹���ģʽ
        //new OrderPizza(new SimpleFactory());
        //System.out.println("~~�˳�����~~");

        new OrderPizza2();
    }

}
