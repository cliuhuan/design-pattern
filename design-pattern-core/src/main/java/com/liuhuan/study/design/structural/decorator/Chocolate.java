package com.liuhuan.study.design.structural.decorator;

/**
 * �����Decorator�� ������ǵ�ζƷ
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes(" �ɿ��� ");
        // ��ζƷ �ļ۸�
        setPrice(3.0f);
    }

}
