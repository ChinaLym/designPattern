package com.lym.designPartten.demo.structType.decoratorPattern.decorator;

import com.lym.designPartten.demo.structType.decoratorPattern.component.AbstractFood;

/**
 * 
* Type: AbstractCondiment
* Description: 所有作料（装饰者）的父类
* @author LYM
* @date 2018年11月25日
 */
public abstract class AbstractCondiment extends AbstractFood {

	AbstractFood food;
	
	public AbstractCondiment(AbstractFood  food) {
		this.food = food; 
	}
	
	@Override
	public String getDescription() {
		return food.getDescription();
	}
	
	@Override
	public double price() {
		return food.price();
	}

}
