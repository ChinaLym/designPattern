package com.lym.designPartten.demo.creationType.singletonPattern.lazy;

/**
 * 
* Type: LazySingleton1
* Description:use DCL to let it safe
* DCL:double check lock.
* Attention: private static volatile, construction method must be private.
* @author LYM
* @date 2018年11月23日
 */
public class LazySingleton1 {
    private static volatile LazySingleton1 singleton;

    private LazySingleton1() {}

    public static LazySingleton1 getInstance() {
        if (singleton == null) {
            synchronized (LazySingleton1.class) {
                if (singleton == null) {
                    singleton = new LazySingleton1();
                }
            }
        }
        return singleton;
    }
}
