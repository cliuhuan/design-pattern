package com.liuhuan.study.design.creational.factory.absfactory.order;

import com.liuhuan.study.design.creational.factory.absfactory.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽象层
 */
public interface AbsFactory {
	/**
	 * 让下面的工厂子类来 具体实现
	 * @param orderType
	 * @return
	 */
	Pizza createPizza(String orderType);
}
