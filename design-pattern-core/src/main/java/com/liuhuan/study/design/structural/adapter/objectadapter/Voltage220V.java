package com.liuhuan.study.design.structural.adapter.objectadapter;

/**
 * ���������
 */
public class Voltage220V {
    /**
     * ���220V�ĵ�ѹ������
     *
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("��ѹ=" + src + "��");
        return src;
    }
}
