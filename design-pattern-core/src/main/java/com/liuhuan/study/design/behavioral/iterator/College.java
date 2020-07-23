package com.liuhuan.study.design.behavioral.iterator;

import java.util.Iterator;

public interface College {

    /**
     * 获取名称
     *
     * @return
     */
    String getName();

    /**
     * 增加系的方法
     *
     * @param name
     * @param desc
     */
    void addDepartment(String name, String desc);

    /**
     * 返回一个迭代器,遍历
     *
     * @return
     */
    Iterator createIterator();
}
