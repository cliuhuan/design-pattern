package com.liuhuan.study.design.behavioral.visitor;

public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }

}
