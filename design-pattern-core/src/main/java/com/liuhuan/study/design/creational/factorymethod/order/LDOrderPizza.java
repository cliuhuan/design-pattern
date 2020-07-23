package com.liuhuan.study.design.creational.factorymethod.order;

import com.liuhuan.study.design.creational.factorymethod.pizza.LDCheesePizza;
import com.liuhuan.study.design.creational.factorymethod.pizza.LDPepperPizza;
import com.liuhuan.study.design.creational.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
