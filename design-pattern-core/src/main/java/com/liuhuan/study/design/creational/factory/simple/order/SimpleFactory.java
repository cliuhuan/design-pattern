package com.liuhuan.study.design.creational.factory.simple.order;

import com.liuhuan.study.design.creational.factory.simple.pizza.CheesePizza;
import com.liuhuan.study.design.creational.factory.simple.pizza.GreekPizza;
import com.liuhuan.study.design.creational.factory.simple.pizza.PepperPizza;
import com.liuhuan.study.design.creational.factory.simple.pizza.Pizza;

/**
 * �򵥹�����
 */
public class SimpleFactory {

    /**
     * orderType ���ض�Ӧ��Pizza ����
     *
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {
        System.out.println("ʹ�ü򵥹���ģʽ");
        return getPizza(orderType);

    }

    private static Pizza getPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" ϣ������ ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" �������� ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("��������");
        }
        return pizza;
    }

    /**
     * ��̬����ģʽ
     *
     * @param orderType
     * @return
     */
    public static Pizza createPizza2(String orderType) {

        System.out.println("ʹ�ü򵥹���ģʽ2");
        return getPizza(orderType);
    }

}
