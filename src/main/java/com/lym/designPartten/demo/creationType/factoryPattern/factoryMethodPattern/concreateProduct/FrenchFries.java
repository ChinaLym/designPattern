package com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.concreateProduct;

import com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.product.Food;

/**
 * 
* Type: FrenchFries
* Description: 薯条
* @author LYM
* @date 2018年11月17日
 */
public class FrenchFries extends Food{
	private static final String NAME = "FrenchFries";
	protected static int initId;
	public FrenchFries() {
		super(NAME);
		initId = 1000;
	}
	@Override
	public String getId() {
		return "FrenchFries--" + initId++;
	}
}
