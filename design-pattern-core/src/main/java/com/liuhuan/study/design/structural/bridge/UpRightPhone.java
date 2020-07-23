package com.liuhuan.study.design.structural.bridge;

public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println(" ֱ����ʽ�ֻ� ");
    }

    @Override
    public void close() {
        super.close();
        System.out.println(" ֱ����ʽ�ֻ� ");
    }

    @Override
    public void call() {
        super.call();
        System.out.println(" ֱ����ʽ�ֻ� ");
    }
}
