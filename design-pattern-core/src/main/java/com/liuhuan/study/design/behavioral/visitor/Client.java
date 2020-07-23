package com.liuhuan.study.design.behavioral.visitor;

/**
 * ������ģʽ
 */
public class Client {

    public static void main(String[] args) {
        //����ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //�ɹ�
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("===============");
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("=======�����Ǵ����Ĳ���========");

        Wait wait = new Wait();
        objectStructure.display(wait);
    }

}
