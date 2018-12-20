package com.lym.designPartten.demo.structType.decoratorPattern.decorator.concreateDecorator;

import com.lym.designPartten.demo.structType.decoratorPattern.component.AbstractFood;
import com.lym.designPartten.demo.structType.decoratorPattern.decorator.AbstractCondiment;

/**
 * 
* Type: Youtiao
* Description: 具体的装饰者，油条是一个装饰者，如煎饼可以加油条，多加2元钱。
* @author LYM
* @date 2018年11月25日
 */
public class Youtiao extends AbstractCondiment{

	public Youtiao(AbstractFood food) {
		super(food);
	}
	
	@Override
	public double price() {
		return super.price() + 2;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " 加油条";
	}
}
