package com.lym.designPartten.demo.creationType.singletonPattern.hungry;

/**
 * 
* Type: HungrySingleton2
* Description: singleton is hungry ( waiting for being used ) 
* @author LYM
* @date 2018年11月23日
 */
public class HungrySingleton2 {
    private static volatile HungrySingleton2 singleton;
   
    static {
    	singleton = new HungrySingleton2();
    }
    
    private HungrySingleton2() {}

    public static HungrySingleton2 getInstance() {
       return singleton;
    }
}
