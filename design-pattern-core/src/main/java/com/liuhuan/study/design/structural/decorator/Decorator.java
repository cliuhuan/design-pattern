package com.liuhuan.study.design.structural.decorator;

/**
 * �Ϳ��ȵ����Ʒ
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice �Լ��۸�
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() �����װ���ߵ���Ϣ
        return des + " " + getPrice() + " && " + obj.getDes();
    }

}
