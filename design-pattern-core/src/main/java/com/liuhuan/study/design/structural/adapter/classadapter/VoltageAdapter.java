package com.liuhuan.study.design.structural.adapter.classadapter;

/**
 * ��������
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        //��ȡ��220V��ѹ
        int srcV = output220V();
        //ת�� 5v
        int dstV = srcV / 44;
        return dstV;
    }

}
