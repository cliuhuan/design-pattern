package com.liuhuan.study.design.behavioral.observe;

/**
 * �ӿ�, ��WeatherData ��ʵ��
 */
public interface Subject {

	/**
	 * ע��
	 * @param o
	 */
	void registerObserver(Observer o);

	/**
	 * �Ƴ�
	 * @param o
	 */
	void removeObserver(Observer o);

	/**
	 * ֪ͨ����
	 */
	void notifyObservers();
}
