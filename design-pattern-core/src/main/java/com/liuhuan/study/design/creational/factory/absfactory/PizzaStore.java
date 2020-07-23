package com.liuhuan.study.design.creational.factory.absfactory;

import com.liuhuan.study.design.creational.factory.absfactory.order.LDFactory;
import com.liuhuan.study.design.creational.factory.absfactory.order.OrderPizza;

public class PizzaStore {

	public static void main(String[] args) {
		//new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory());
	}

}
