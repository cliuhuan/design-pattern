package com.liuhuan.study.design.structural.adapter.objectadapter;

/**
 * ��������
 */
public class VoltageAdapter implements IVoltage5V {

    /**
     * ������ϵ-�ۺ�
     */
    private Voltage220V voltage220V;

    /**
     * ͨ��������������һ�� Voltage220V ʵ��
     *
     * @param voltage220v
     */
    public VoltageAdapter(Voltage220V voltage220v) {
        this.voltage220V = voltage220v;
    }

    @Override
    public int output5V() {

        int dst = 0;
        if (null != voltage220V) {
            //��ȡ220V ��ѹ
            int src = voltage220V.output220V();
            System.out.println("ʹ�ö�������������������~~");
            dst = src / 44;
            System.out.println("������ɣ�����ĵ�ѹΪ=" + dst);
        }

        return dst;

    }

}
