package com.liuhuan.study.design.creational.factory.simple.order;

import com.liuhuan.study.design.creational.factory.simple.pizza.CheesePizza;
import com.liuhuan.study.design.creational.factory.simple.pizza.GreekPizza;
import com.liuhuan.study.design.creational.factory.simple.pizza.PepperPizza;
import com.liuhuan.study.design.creational.factory.simple.pizza.Pizza;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    /**
     * orderType 返回对应的Pizza 对象
     *
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");
        return getPizza(orderType);

    }

    private static Pizza getPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

    /**
     * 静态工厂模式
     *
     * @param orderType
     * @return
     */
    public static Pizza createPizza2(String orderType) {

        System.out.println("使用简单工厂模式2");
        return getPizza(orderType);
    }

}
