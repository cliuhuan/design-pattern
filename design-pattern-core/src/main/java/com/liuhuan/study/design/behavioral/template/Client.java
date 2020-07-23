package com.liuhuan.study.design.behavioral.template;

/**
 * ģ��ģʽ
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("----�����춹����----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----������������----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("----����������----");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }

}
