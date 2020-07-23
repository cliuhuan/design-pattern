package com.liuhuan.study.design.creational.singleton;

/**
 * @author LiuHuan
 * @date 2020-07-20 10:53
 * @desc 饿汉式2，线程安全，占用内存
 */
public class HungrySingleton2 {

    private static HungrySingleton2 singleton;

    private HungrySingleton2(){}

    static {
        singleton = new HungrySingleton2();
    }

    public static HungrySingleton2 getInstance() {
        return singleton;
    }

}
