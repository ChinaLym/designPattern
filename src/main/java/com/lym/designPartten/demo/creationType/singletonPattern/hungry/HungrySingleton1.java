package com.lym.designPartten.demo.creationType.singletonPattern.hungry;

/**
 * 
* Type: HungrySingleton1
* @author LYM
* @date 2018年11月23日
 */
public class HungrySingleton1 {
    private static volatile HungrySingleton1 singleton = new HungrySingleton1();

    private HungrySingleton1() {}

    public static HungrySingleton1 getInstance() {
       return singleton;
    }
}
