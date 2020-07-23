package com.liuhuan.study.design.behavioral.memento.theory;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState(" ״̬#1 ������ 100 ");
        //�����˵�ǰ��״̬
        caretaker.add(originator.saveStateMemento());

        originator.setState(" ״̬#2 ������ 80 ");
        caretaker.add(originator.saveStateMemento());

        originator.setState(" ״̬#3 ������ 50 ");
        caretaker.add(originator.saveStateMemento());

        System.out.println("��ǰ��״̬�� =" + originator.getState());

        //ϣ���õ�״̬ 1, �� originator �ָ���״̬1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("�ָ���״̬1 , ��ǰ��״̬��");
        System.out.println("��ǰ��״̬�� =" + originator.getState());

    }

}
