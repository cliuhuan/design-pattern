package com.liuhuan.study.design.structural.decorator;

public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes(" ¶¹½¬  ");
        setPrice(1.5f);
    }

}
