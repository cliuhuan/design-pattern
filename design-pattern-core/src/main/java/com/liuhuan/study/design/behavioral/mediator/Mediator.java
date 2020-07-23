package com.liuhuan.study.design.behavioral.mediator;

/**
 * 中介者抽象类
 */
public abstract class Mediator {
    /**
     * 将给中介者对象，加入到集合中
     *
     * @param colleagueName
     * @param colleague
     */
    public abstract void Register(String colleagueName, Colleague colleague);

    /**
     * 接收消息, 具体的同事对象发出
     *
     * @param stateChange
     * @param colleagueName
     */
    public abstract void GetMessage(int stateChange, String colleagueName);

    /**
     * 发送信息
     */
    public abstract void SendMessage();
}
