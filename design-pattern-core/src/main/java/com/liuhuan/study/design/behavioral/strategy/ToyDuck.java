package com.liuhuan.study.design.behavioral.strategy;

public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("���Ѽ");
    }

    @Override
    public void quack() {
        System.out.println("���Ѽ���ܽ�~~");
    }

    @Override
    public void swim() {
        System.out.println("���Ѽ������Ӿ~~");
    }

}
