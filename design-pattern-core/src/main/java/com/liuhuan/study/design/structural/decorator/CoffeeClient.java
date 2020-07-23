package com.liuhuan.study.design.structural.decorator;

public class CoffeeClient {

	public static void main(String[] args) {
		// װ����ģʽ�µĶ�����2���ɿ���+һ��ţ�̵�LongBlack

		// 1. ��һ�� LongBlackCoffee
		Drink order = new LongBlackCoffee();
		System.out.println("����1=" + order.cost());
		System.out.println("����=" + order.getDes());

		// 2. order ����һ��ţ��
		order = new Milk(order);

		System.out.println("order ����һ��ţ�� ���� =" + order.cost());
		System.out.println("order ����һ��ţ�� ���� = " + order.getDes());

		// 3. order ����һ���ɿ���

		order = new Chocolate(order);

		System.out.println("order ����һ��ţ�� ����һ���ɿ���  ���� =" + order.cost());
		System.out.println("order ����һ��ţ�� ����һ���ɿ��� ���� = " + order.getDes());

		// 3. order ����һ���ɿ���

		order = new Chocolate(order);

		System.out.println("order ����һ��ţ�� ����2���ɿ���   ���� =" + order.cost());
		System.out.println("order ����һ��ţ�� ����2���ɿ��� ���� = " + order.getDes());

		System.out.println("===========================");

		Drink order2 = new DeCoffee();

		System.out.println("order2 ���򿧷�  ���� =" + order2.cost());
		System.out.println("order2 ���򿧷� ���� = " + order2.getDes());

		order2 = new Milk(order2);

		System.out.println("order2 ���򿧷� ����һ��ţ��  ���� =" + order2.cost());
		System.out.println("order2 ���򿧷� ����һ��ţ�� ���� = " + order2.getDes());


	}

}
