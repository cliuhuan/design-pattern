package com.liuhuan.study.design.structural.decorator;

/**
 * ¿§·È
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
