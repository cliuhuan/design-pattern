package com.liuhuan.study.design.creational.factory.absfactory.order;

import com.liuhuan.study.design.creational.factory.absfactory.pizza.BJCheesePizza;
import com.liuhuan.study.design.creational.factory.absfactory.pizza.BJPepperPizza;
import com.liuhuan.study.design.creational.factory.absfactory.pizza.Pizza;

public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
