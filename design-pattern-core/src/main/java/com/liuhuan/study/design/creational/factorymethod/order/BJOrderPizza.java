package com.liuhuan.study.design.creational.factorymethod.order;

import com.liuhuan.study.design.creational.factorymethod.pizza.BJCheesePizza;
import com.liuhuan.study.design.creational.factorymethod.pizza.BJPepperPizza;
import com.liuhuan.study.design.creational.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
