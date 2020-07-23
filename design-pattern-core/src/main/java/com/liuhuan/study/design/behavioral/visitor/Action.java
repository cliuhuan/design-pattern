package com.liuhuan.study.design.behavioral.visitor;

public abstract class Action {

    /**
     * �õ����� �Ĳ���
     *
     * @param man
     */
    public abstract void getManResult(Man man);

    /**
     * �õ�Ů�� ����
     *
     * @param woman
     */
    public abstract void getWomanResult(Woman woman);
}
