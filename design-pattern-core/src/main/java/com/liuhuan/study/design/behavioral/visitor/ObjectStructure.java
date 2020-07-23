package com.liuhuan.study.design.behavioral.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * ���ݽṹ������ܶ��ˣ�Man , Woman��
 */
public class ObjectStructure {

    /**
     * ���ݽṹ������ܶ��ˣ�Man , Woman��
     */
    private List<Person> persons = new LinkedList<>();

    /**
     * ���ӵ�list
     *
     * @param p
     */
    public void attach(Person p) {
        persons.add(p);
    }

    /**
     * �Ƴ�
     *
     * @param p
     */
    public void detach(Person p) {
        persons.remove(p);
    }

    /**
     * ��ʾ�������
     *
     * @param action
     */
    public void display(Action action) {
        for (Person p : persons) {
            p.accept(action);
        }
    }
}
