package com.liuhuan.study.design.structural.proxy.staticproxy;

/**
 * �������,��̬����
 */
public class TeacherDaoProxy implements Teacher {

    /**
     * Ŀ�����ͨ���ӿ����ۺ�
     */
    private Teacher target;

    public TeacherDaoProxy(Teacher target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("��ʼ����  ���ĳЩ�������������� ");
        target.teach();
        System.out.println("�ύ����������");
    }

}
