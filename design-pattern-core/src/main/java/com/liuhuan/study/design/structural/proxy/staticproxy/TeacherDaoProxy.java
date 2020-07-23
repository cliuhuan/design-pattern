package com.liuhuan.study.design.structural.proxy.staticproxy;

/**
 * 代理对象,静态代理
 */
public class TeacherDaoProxy implements Teacher {

    /**
     * 目标对象，通过接口来聚合
     */
    private Teacher target;

    public TeacherDaoProxy(Teacher target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理  完成某些操作。。。。。 ");
        target.teach();
        System.out.println("提交。。。。。");
    }

}
