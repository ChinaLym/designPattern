package com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.product;

/**
 * 
* Type: Food
* Description: 抽象产品类
* @author LYM
* @date 2018年11月17日
 */
public abstract class Food {
	private String name;
	
	public Food(String name) {
		this.name = name;
	}
	
	public void getDescription() {
		System.out.println("This is a " + name);
	}
	
	//return a unique string
	abstract public String getId(); 
}
