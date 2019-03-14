package com.reiden.homework.patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/14
 */
public class HungrySingleton {
    private static HungrySingleton INSTANCE=new HungrySingleton();
    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}
