package com.liuhuan.study.design.behavioral.observe;

/**
 * 接口, 让WeatherData 来实现
 */
public interface Subject {

	/**
	 * 注册
	 * @param o
	 */
	void registerObserver(Observer o);

	/**
	 * 移除
	 * @param o
	 */
	void removeObserver(Observer o);

	/**
	 * 通知所有
	 */
	void notifyObservers();
}
