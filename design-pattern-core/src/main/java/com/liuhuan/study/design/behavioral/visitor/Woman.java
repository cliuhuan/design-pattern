package com.liuhuan.study.design.behavioral.visitor;

/**
 * ˵�� ��������ʹ�õ���˫����, �������ڿͻ��˳����У�������״̬��Ϊ��������Woman��(��һ�η���)
 * Ȼ��Woman �������Ϊ������ "���巽��" �з���getWomanResult, ͬʱ���Լ�(this)��Ϊ�������룬��ɵڶ��εķ���
 */
public class Woman extends Person {

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }

}
