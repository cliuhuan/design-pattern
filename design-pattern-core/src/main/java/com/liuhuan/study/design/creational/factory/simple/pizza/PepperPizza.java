package com.liuhuan.study.design.creational.factory.simple.pizza;

/**
 * 胡椒披萨
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }

}
