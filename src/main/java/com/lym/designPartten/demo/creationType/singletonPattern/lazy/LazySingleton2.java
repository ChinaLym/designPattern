package com.lym.designPartten.demo.creationType.singletonPattern.lazy;

/**
 * 
* Type: LazySingleton2
* Description: user static inner class, JVM let it safe and lazy.
* @author LYM
* @date 2018年11月23日
 */
public class LazySingleton2 {
	private LazySingleton2() {}
	
	private static class SingletonInstance {
        private static final LazySingleton2 INSTANCE = new LazySingleton2();
    }

    public static LazySingleton2 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
