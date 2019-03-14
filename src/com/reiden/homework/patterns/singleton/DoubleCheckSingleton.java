package com.reiden.homework.patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/14
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton INSTANCE;

    /**
     * 防止反射破坏
     */
    private DoubleCheckSingleton() {
        synchronized (DoubleCheckSingleton.class) {
            if (INSTANCE != null) {
                throw new RuntimeException("已经创建了实例");
            }
        }
    }

    /**
     * 防止序列化破坏
     */
    private Object readResolve() {
        return INSTANCE;
    }

    public static DoubleCheckSingleton getInstance() {
        if (INSTANCE == null)
            synchronized (DoubleCheckSingleton.class) {
                if (INSTANCE == null)
                    return new DoubleCheckSingleton();
            }
        return INSTANCE;
    }
}
