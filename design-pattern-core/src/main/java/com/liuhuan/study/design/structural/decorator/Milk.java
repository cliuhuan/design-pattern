package com.liuhuan.study.design.structural.decorator;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes(" ţ�� ");
        setPrice(2.0f);
    }

}
