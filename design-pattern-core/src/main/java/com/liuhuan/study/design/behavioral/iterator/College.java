package com.liuhuan.study.design.behavioral.iterator;

import java.util.Iterator;

public interface College {

    /**
     * ��ȡ����
     *
     * @return
     */
    String getName();

    /**
     * ����ϵ�ķ���
     *
     * @param name
     * @param desc
     */
    void addDepartment(String name, String desc);

    /**
     * ����һ��������,����
     *
     * @return
     */
    Iterator createIterator();
}
