package com.liuhuan.study.design.behavioral.state.lottery;

/**
 * ״̬ģʽ������
 */
public class ClientTest {

    public static void main(String[] args) {
        // ��������󣬽�Ʒ��1����Ʒ
        RaffleActivity activity = new RaffleActivity(1);

        // ����������300�ν�
        for (int i = 0; i < 30; i++) {
            System.out.println("--------��" + (i + 1) + "�γ齱----------");
            // �μӳ齱����һ������۳�����
            activity.debuctMoney();

            // �ڶ����齱
            activity.raffle();
        }
    }

}
