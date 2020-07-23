package com.liuhuan.study.design.structural.facade;

public class Client {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        //准备
        homeTheaterFacade.ready();
        //开始
        homeTheaterFacade.play();
        //结束
        homeTheaterFacade.end();

    }

}
