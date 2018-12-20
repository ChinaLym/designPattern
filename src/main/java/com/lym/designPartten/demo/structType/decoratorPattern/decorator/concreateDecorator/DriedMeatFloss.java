package com.lym.designPartten.demo.structType.decoratorPattern.decorator.concreateDecorator;

import com.lym.designPartten.demo.structType.decoratorPattern.component.AbstractFood;
import com.lym.designPartten.demo.structType.decoratorPattern.decorator.AbstractCondiment;

/**
 * 
* Type: DriedMeatFloss
* Description: 具体的装饰者，肉松是一个装饰者，如煎饼可以加肉松，多加1元钱。
* @author LYM
* @date 2018年11月25日
 */
public class DriedMeatFloss extends AbstractCondiment {

	public DriedMeatFloss(AbstractFood food) {
		super(food);
	}
	
	@Override
	public double price() {
		return super.price() + 1;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " 加肉松";
	}

}
