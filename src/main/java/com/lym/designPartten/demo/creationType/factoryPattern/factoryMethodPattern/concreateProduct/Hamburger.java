package com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.concreateProduct;

import com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.product.Food;

/**
 * 
* Type: FrenchFries
* Description: 薯条
* @author LYM
* @date 2018年11月17日
 */
public class Hamburger extends Food{
	private static final String NAME = "Hamburger";
	protected static int initId;
	public Hamburger() {
		super(NAME);
		initId = 5000;
	}
	@Override
	public String getId() {
		return "FrenchFries--" + initId++;
	}
}
