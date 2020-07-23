package com.liuhuan.study.design.behavioral.observe;

import java.util.ArrayList;

/**
 * ���Ǻ���
 * 1. �������µ����������Ϣ
 * 2. ���� �۲��߼��ϣ�ʹ��ArrayList����
 * 3. �������и���ʱ���������ĵ���   ArrayList, ֪ͨ���еģ����뷽���Ϳ������µ���Ϣ
 */
public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;

    /**
     * �۲��߼���
     */
    private ArrayList<Observer> observers;

    /**
     * �����µĵ�����
     */
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        //���� ���뷽�� update
        notifyObservers();
    }

    /**
     * �������и���ʱ���͵��� setData
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //����dataChange�� �����µ���Ϣ ���͸� ���뷽 currentConditions
        dataChange();
    }

    /**
     * ע��һ���۲���
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * �Ƴ�һ���۲���
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    /**
     * �������еĹ۲��ߣ���֪ͨ
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperatrue, this.pressure, this.humidity);
        }
    }
}
