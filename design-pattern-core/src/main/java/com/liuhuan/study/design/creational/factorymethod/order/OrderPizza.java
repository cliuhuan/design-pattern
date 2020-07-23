package com.liuhuan.study.design.creational.factorymethod.order;

import com.liuhuan.study.design.creational.factorymethod.pizza.Pizza;

import static com.liuhuan.study.design.creational.factory.absfactory.order.OrderPizza.getInputStr;

public abstract class OrderPizza {

    /**
     * ����һ�����󷽷���createPizza , �ø������������Լ�ʵ��
     *
     * @param orderType
     * @return
     */
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        // ��������������
        String orderType;
        do {
            orderType = getType();
            //���󷽷����ɹ����������
            pizza = createPizza(orderType);
            //���pizza ��������
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    /**
     * дһ�����������Ի�ȡ�ͻ�ϣ����������������
     *
     * @return
     */
    private String getType() {
        return getInputStr();
    }

}
