package com.liuhuan.study.design.structural.facade;

public class Client {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        //׼��
        homeTheaterFacade.ready();
        //��ʼ
        homeTheaterFacade.play();
        //����
        homeTheaterFacade.end();

    }

}
