package com.liuhuan.study.design.behavioral.strategy;

public class PekingDuck extends Duck {

    /**
     * ���籱��Ѽ���Է��裬���Ƿ��輼��һ��
     */
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();

    }

    @Override
    public void display() {
        System.out.println("~~����Ѽ~~~");
    }

}