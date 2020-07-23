package com.liuhuan.study.design.behavioral.visitor;

public abstract class Action {

    /**
     * 得到男性 的测评
     *
     * @param man
     */
    public abstract void getManResult(Man man);

    /**
     * 得到女的 测评
     *
     * @param woman
     */
    public abstract void getWomanResult(Woman woman);
}
