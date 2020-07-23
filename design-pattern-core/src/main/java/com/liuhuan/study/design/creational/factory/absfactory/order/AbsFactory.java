package com.liuhuan.study.design.creational.factory.absfactory.order;

import com.liuhuan.study.design.creational.factory.absfactory.pizza.Pizza;

/**
 * һ�����󹤳�ģʽ�ĳ����
 */
public interface AbsFactory {
	/**
	 * ������Ĺ��������� ����ʵ��
	 * @param orderType
	 * @return
	 */
	Pizza createPizza(String orderType);
}
