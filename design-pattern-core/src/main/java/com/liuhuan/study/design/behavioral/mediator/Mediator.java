package com.liuhuan.study.design.behavioral.mediator;

/**
 * �н��߳�����
 */
public abstract class Mediator {
    /**
     * �����н��߶��󣬼��뵽������
     *
     * @param colleagueName
     * @param colleague
     */
    public abstract void Register(String colleagueName, Colleague colleague);

    /**
     * ������Ϣ, �����ͬ�¶��󷢳�
     *
     * @param stateChange
     * @param colleagueName
     */
    public abstract void GetMessage(int stateChange, String colleagueName);

    /**
     * ������Ϣ
     */
    public abstract void SendMessage();
}
