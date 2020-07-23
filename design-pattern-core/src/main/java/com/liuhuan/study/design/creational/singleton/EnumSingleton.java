package com.liuhuan.study.design.creational.singleton;

/**
 * @author LiuHuan
 * @date 2020-05-06 16:43
 * @desc 枚举，推荐
 */
public class EnumSingleton {

    private EnumSingleton(){}

    /**
     * 定义静态枚举类
     */
    private static enum SingletonEnum {

        //创建枚举对象，该对象天生单例
        SINGLETON;

        private EnumSingleton singleton;

        private SingletonEnum(){
            singleton = new EnumSingleton();
        }

        EnumSingleton getSingleton(){
            return singleton;
        }
    }

    public static EnumSingleton getInstance(){
        return SingletonEnum.SINGLETON.getSingleton();
    }
}
