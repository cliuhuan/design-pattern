package com.liuhuan.study.design.behavioral.state.lottery;

/**
 * ״̬������
 */
public abstract class State {

    /**
     * �۳����� - 50
     */
    public abstract void deductMoney();

    /**
     * �Ƿ���н�Ʒ
     *
     * @return
     */
    public abstract boolean raffle();

    /**
     * ���Ž�Ʒ
     */
    public abstract void dispensePrize();

}
