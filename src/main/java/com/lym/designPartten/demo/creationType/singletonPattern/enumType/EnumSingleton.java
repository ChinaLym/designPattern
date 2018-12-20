package com.lym.designPartten.demo.creationType.singletonPattern.enumType;

/**
 * 
* Type: HungrySingleton3
* Description: enum is public final class T extends Enum facturlly. 
* @author LYM
* @date 2018年11月23日
 */
public enum EnumSingleton {
	INSTANCE;
    public void whateverMethod() {
    	System.out.println("do something");
    }
}
