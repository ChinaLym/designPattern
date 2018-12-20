package com.lym.designPartten.demo.structType.decoratorPattern.component.concreateComponent;

import com.lym.designPartten.demo.structType.decoratorPattern.component.AbstractFood;

/**
 * 
* Type: Pancake
* Description:实际食物，煎饼果子 
* @author LYM
* @date 2018年11月25日
 */
public class Pancake extends AbstractFood{

	public Pancake() {
		description = "煎饼";
	}
	
	//什么都不加的煎饼 5块钱
	@Override
	public double price() {
		return 5;
	}
	
}
