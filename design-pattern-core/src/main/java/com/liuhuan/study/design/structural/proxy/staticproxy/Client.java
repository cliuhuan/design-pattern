package com.liuhuan.study.design.structural.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        //����Ŀ�����(���������)
        EnglishTeacher teacherDao = new EnglishTeacher();

        //�����������, ͬʱ����������󴫵ݸ��������
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //ͨ��������󣬵��õ����������ķ���
        //����ִ�е��Ǵ������ķ��������������ȥ����Ŀ�����ķ���
        teacherDaoProxy.teach();
    }

}
