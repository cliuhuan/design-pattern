package com.liuhuan.study.design.creational.factory.simple.order;

import com.liuhuan.study.design.creational.factory.simple.pizza.Pizza;

import static com.liuhuan.study.design.creational.factory.absfactory.order.OrderPizza.getInputStr;

/**
 * 订单类
 */
public class OrderPizza {

    private SimpleFactory simpleFactory;
    private Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        // 用户输入的类型
        String orderType;

        // 设置简单工厂对象
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            // 输出pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    /**
     * 可以获取客户希望订购的披萨种类
     *
     * @return
     */
    static String getType() {
        return getInputStr();
    }

}
