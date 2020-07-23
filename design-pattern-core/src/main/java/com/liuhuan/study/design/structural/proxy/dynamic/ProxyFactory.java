package com.liuhuan.study.design.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * ������
 */
public class ProxyFactory {

    /**
     * ά��һ��Ŀ����� , Object
     */
    private Object target;

    /**
     * ������ �� ��target ���г�ʼ��
     *
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * ��Ŀ����� ����һ���������
     *
     * @return
     */
    public Object getProxyInstance() {

		/*
            1. ClassLoader loader �� ָ����ǰĿ�����ʹ�õ��������, ��ȡ�������ķ����̶�
            2. Class<?>[] interfaces: Ŀ�����ʵ�ֵĽӿ����ͣ�ʹ�÷��ͷ���ȷ������
            3. InvocationHandler h : ���鴦��ִ��Ŀ�����ķ���ʱ���ᴥ�����鴦��������, ��ѵ�ǰִ�е�Ŀ����󷽷���Ϊ��������
		 */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            (proxy, method, args) -> {
                System.out.println("JDK����ʼ~~");
                //������Ƶ���Ŀ�����ķ���
                Object returnVal = method.invoke(target, args);
                System.out.println("JDK�����ύ");
                return returnVal;
            });
    }

}
