package com.liuhuan.study.design.behavioral.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    // ʹ�����鱣�����
    Department[] departments;
    // ���浱ǰ����Ķ������
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Javaרҵ", " Javaרҵ ");
        addDepartment("PHPרҵ", " PHPרҵ ");
        addDepartment("������רҵ", " ������רҵ ");
    }

    @Override
    public String getName() {
        return "�����ѧԺ";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

}
