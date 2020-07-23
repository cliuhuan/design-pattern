package com.liuhuan.study.design.creational.singleton;

/**
 * @author LiuHuan
 * @date 2020-05-06 16:35
 * @desc 饿汉式1，线程安全，占用内存
 */
public class HungrySingleton1 {

    private static HungrySingleton1 singleton = new HungrySingleton1();

    private HungrySingleton1(){}

    public static HungrySingleton1 getInstance() {
        return singleton;
    }

}
