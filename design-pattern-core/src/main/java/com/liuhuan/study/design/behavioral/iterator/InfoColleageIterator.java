package com.liuhuan.study.design.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoColleageIterator implements Iterator {

    /**
     * ��Ϣ����ѧԺ����List��ʽ���ϵ
     */
    List<Department> departmentList;
    /**
     * ����
     */
    int index = -1;

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }

}
