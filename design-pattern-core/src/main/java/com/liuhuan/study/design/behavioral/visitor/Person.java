package com.liuhuan.study.design.behavioral.visitor;

public abstract class Person {

    /**
     * �ṩһ���������÷����߿��Է���
     *
     * @param action
     */
    public abstract void accept(Action action);
}
