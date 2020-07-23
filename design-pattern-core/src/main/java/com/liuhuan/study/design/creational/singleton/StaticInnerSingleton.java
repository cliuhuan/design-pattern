package com.liuhuan.study.design.creational.singleton;

/**
 * @author LiuHuan
 * @date 2020-05-06 16:39
 * @desc 静态内部类，推荐使用
 */
public class StaticInnerSingleton {

    private static class SingletonHolder {
        private static final StaticInnerSingleton SINGLETON = new StaticInnerSingleton();
    }

    private StaticInnerSingleton(){}

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

}
