package com.reiden.homework.patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/14
 */
public class InnerClassSingleton {


    private InnerClassSingleton() {}

    private static class SingletonInstance {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
