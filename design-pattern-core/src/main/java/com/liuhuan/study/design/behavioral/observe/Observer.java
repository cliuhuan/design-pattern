package com.liuhuan.study.design.behavioral.observe;

/**
 * �۲��߽ӿڣ��ɹ۲�����ʵ��
 */
public interface Observer {

    /**
     * ������Ϣ
     * @param temperature
     * @param pressure
     * @param humidity
     */
	void update(float temperature, float pressure, float humidity);
}
