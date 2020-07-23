package com.liuhuan.study.design.creational.factory.simple;

import com.liuhuan.study.design.creational.factory.simple.order.OrderPizza2;

public class PizzaStore {

    public static void main(String[] args) {
        //new OrderPizza();

        //使用简单工厂模式
        //new OrderPizza(new SimpleFactory());
        //System.out.println("~~退出程序~~");

        new OrderPizza2();
    }

}
