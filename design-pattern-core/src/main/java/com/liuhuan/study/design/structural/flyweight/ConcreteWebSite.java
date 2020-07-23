package com.liuhuan.study.design.structural.flyweight;

/**
 * ������վ
 */
public class ConcreteWebSite extends WebSite {

	/**
	 * ����Ĳ��֣��ڲ�״̬
	 * ��վ��������ʽ(����)
	 */
	private String type;


	public ConcreteWebSite(String type) {
		this.type = type;
	}


	@Override
	public void use(User user) {
		System.out.println("��վ�ķ�����ʽΪ:" + type + " ��ʹ���� .. ʹ������" + user.getName());
	}


}
