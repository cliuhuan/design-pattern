package com.liuhuan.study.design.creational.singleton;

import java.util.Objects;

/**
 * @author LiuHuan
 * @date 2020-07-20 10:56
 * @desc 懒汉式，线程不安全
 */
public class UnSafeLazySingleton {

    private static UnSafeLazySingleton singleton;

    private UnSafeLazySingleton() {}

    public static UnSafeLazySingleton getInstance() {
        if (Objects.isNull(singleton)) {
            singleton = new UnSafeLazySingleton();
        }
        return singleton;
    }

}
