package com.liuhuan.study.design.creational.singleton;

import java.util.Objects;

/**
 * @author LiuHuan
 * @date 2020-05-06 16:29
 * @desc 懒汉式，线程安全
 */
public class SafeLazySingleton {

    private static SafeLazySingleton singleton;

    private SafeLazySingleton(){}

    public static synchronized SafeLazySingleton getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new SafeLazySingleton();
        }
        return singleton;
    }
}
