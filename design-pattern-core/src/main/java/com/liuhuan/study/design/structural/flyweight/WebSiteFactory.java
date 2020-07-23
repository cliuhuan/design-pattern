package com.liuhuan.study.design.structural.flyweight;

import java.util.HashMap;

/**
 * ��վ�����࣬������Ҫ����һ����վ
 */
public class WebSiteFactory {

    /**
     * ���ϣ� �䵱�ص�����
     */
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    /**
     * ������վ�����ͣ�����һ����վ, ���û�оʹ���һ����վ�������뵽����,������
     *
     * @param type
     * @return
     */
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            //�ʹ���һ����վ�������뵽����
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    /**
     * ��ȡ��վ��������� (�����ж��ٸ���վ����)
     *
     * @return
     */
    public int getWebSiteCount() {
        return pool.size();
    }
}
