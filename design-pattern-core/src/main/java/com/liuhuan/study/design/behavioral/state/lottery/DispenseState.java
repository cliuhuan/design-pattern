package com.liuhuan.study.design.behavioral.state.lottery;

/**
 * ���Ž�Ʒ��״̬
 */
public class DispenseState extends State {

    /**
     * ��ʼ��ʱ�������ã����Ž�Ʒ��ı���״̬
     */
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("���ܿ۳�����");
    }

    @Override
    public boolean raffle() {
        System.out.println("���ܳ齱");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("��ϲ�н���");
            // �ı�״̬Ϊ���ܳ齱
            activity.setState(activity.getNoRafflleState());
        } else {
            System.out.println("���ź�����Ʒ��������");
            // �ı�״̬Ϊ��Ʒ�������, �������ǾͲ����Գ齱
            activity.setState(activity.getDispensOutState());
            //System.out.println("�齱�����");
            //System.exit(0);
        }

    }
}
