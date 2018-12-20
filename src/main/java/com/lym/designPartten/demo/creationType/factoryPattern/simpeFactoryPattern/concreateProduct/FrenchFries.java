package com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.concreateProduct;

import com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.product.Food;

/**
 * 
* Type: FrenchFries
* Description: 薯条
* @author LYM
* @date 2018年11月17日
 */
public class FrenchFries implements Food{

	@Override
	public void show() {
		System.out.println("FrenchFries!");
		
	}

}
