package com.liuhuan.study.design.creational.singleton;

import java.util.Objects;

/**
 * @author LiuHuan
 * @date 2020-05-06 16:59
 * @desc 双重校验锁，推荐
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance() {
        if (Objects.isNull(singleton)) {
            synchronized (DoubleCheckSingleton.class) {
                if (Objects.isNull(singleton)) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
