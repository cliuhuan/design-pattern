package com.liuhuan.study.design.structural.adapter.classadapter;

/**
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        //转成 5v
        int dstV = srcV / 44;
        return dstV;
    }

}
