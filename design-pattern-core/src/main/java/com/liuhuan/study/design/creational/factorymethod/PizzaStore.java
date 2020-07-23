package com.liuhuan.study.design.creational.factorymethod;

import com.liuhuan.study.design.creational.factorymethod.order.BJOrderPizza;
import com.liuhuan.study.design.creational.factorymethod.order.LDOrderPizza;

public class PizzaStore {

    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //����������ζ�ĸ���Pizza
            new BJOrderPizza();
        } else {
            //�����׶ؿ�ζ�ĸ���Pizza
            new LDOrderPizza();
        }
    }

}
