package com.liuhuan.study.design.behavioral.observe;

public class BaiduSite implements Observer {

    /**
     * �¶�
     */
    private float temperature;
    /**
     * ��ѹ
     */
    private float pressure;
    /**
     * ʪ��
     */
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    /**
     * ��ʾ
     */
    public void display() {
        System.out.println("===�ٶ���վ====");
        System.out.println("***�ٶ���վ ���� : " + temperature + "***");
        System.out.println("***�ٶ���վ ��ѹ: " + pressure + "***");
        System.out.println("***�ٶ���վ ʪ��: " + humidity + "***");
    }

}
