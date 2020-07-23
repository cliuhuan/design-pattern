package com.liuhuan.study.design.creational.factory.simple.order;

import com.liuhuan.study.design.creational.factory.simple.pizza.Pizza;

import static com.liuhuan.study.design.creational.factory.simple.order.OrderPizza.getType;

public class OrderPizza2 {

    Pizza pizza;
    String orderType;

    public OrderPizza2() {

        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

            // ���pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" ��������ʧ�� ");
                break;
            }
        } while (true);
    }

}
