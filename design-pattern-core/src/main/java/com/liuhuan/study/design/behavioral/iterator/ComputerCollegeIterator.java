package com.liuhuan.study.design.behavioral.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    /**
     * ����������ҪDepartment ���������ķ�ʽ���=>����
     */
    Department[] departments;
    /**
     * ������λ��
     */
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }

}
