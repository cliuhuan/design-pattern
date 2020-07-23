package com.liuhuan.study.design.creational.factory.simple.order;

import com.liuhuan.study.design.creational.factory.simple.pizza.Pizza;

import static com.liuhuan.study.design.creational.factory.absfactory.order.OrderPizza.getInputStr;

/**
 * ������
 */
public class OrderPizza {

    private SimpleFactory simpleFactory;
    private Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        // �û����������
        String orderType;

        // ���ü򵥹�������
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

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

    /**
     * ���Ի�ȡ�ͻ�ϣ����������������
     *
     * @return
     */
    static String getType() {
        return getInputStr();
    }

}
