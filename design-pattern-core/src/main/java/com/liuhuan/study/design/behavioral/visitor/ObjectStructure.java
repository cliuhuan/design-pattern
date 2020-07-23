package com.liuhuan.study.design.behavioral.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理很多人（Man , Woman）
 */
public class ObjectStructure {

    /**
     * 数据结构，管理很多人（Man , Woman）
     */
    private List<Person> persons = new LinkedList<>();

    /**
     * 增加到list
     *
     * @param p
     */
    public void attach(Person p) {
        persons.add(p);
    }

    /**
     * 移除
     *
     * @param p
     */
    public void detach(Person p) {
        persons.remove(p);
    }

    /**
     * 显示测评情况
     *
     * @param action
     */
    public void display(Action action) {
        for (Person p : persons) {
            p.accept(action);
        }
    }
}
