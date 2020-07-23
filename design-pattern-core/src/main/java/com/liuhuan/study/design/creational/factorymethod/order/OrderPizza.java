package com.liuhuan.study.design.creational.factorymethod.order;

import com.liuhuan.study.design.creational.factorymethod.pizza.Pizza;

import static com.liuhuan.study.design.creational.factory.absfactory.order.OrderPizza.getInputStr;

public abstract class OrderPizza {

    /**
     * 定义一个抽象方法，createPizza , 让各个工厂子类自己实现
     *
     * @param orderType
     * @return
     */
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        // 订购披萨的类型
        String orderType;
        do {
            orderType = getType();
            //抽象方法，由工厂子类完成
            pizza = createPizza(orderType);
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     *
     * @return
     */
    private String getType() {
        return getInputStr();
    }

}
