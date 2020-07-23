package com.liuhuan.study.design.creational.factorymethod;

import com.liuhuan.study.design.creational.factorymethod.order.BJOrderPizza;
import com.liuhuan.study.design.creational.factorymethod.order.LDOrderPizza;

public class PizzaStore {

    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
    }

}
