package com.liuhuan.study.design.creational.factory.simple.pizza;

/**
 * 奶酪披萨
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨准备原材料 ");
    }

}
