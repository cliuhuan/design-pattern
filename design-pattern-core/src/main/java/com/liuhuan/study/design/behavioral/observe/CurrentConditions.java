package com.liuhuan.study.design.behavioral.observe;

public class CurrentConditions implements Observer {

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

    /**
     * ���� ������������� WeatherData �����ã�ʹ������ģʽ
     * @param temperature
     * @param pressure
     * @param humidity
     */
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
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
