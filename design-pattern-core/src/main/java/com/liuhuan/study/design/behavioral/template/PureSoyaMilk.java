package com.liuhuan.study.design.behavioral.template;

public class PureSoyaMilk extends SoyaMilk {

    @Override
    void addCondiments() {
        //��ʵ��
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }

}
