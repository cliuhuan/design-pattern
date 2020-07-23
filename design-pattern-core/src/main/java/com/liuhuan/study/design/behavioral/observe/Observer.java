package com.liuhuan.study.design.behavioral.observe;

/**
 * 观察者接口，由观察者来实现
 */
public interface Observer {

    /**
     * 更新信息
     * @param temperature
     * @param pressure
     * @param humidity
     */
	void update(float temperature, float pressure, float humidity);
}
