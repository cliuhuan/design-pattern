package com.liuhuan.study.design.structural.decorator;

/**
 * ����
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
