package com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.concreateCreator;

import com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.concreateProduct.Pizza;
import com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.creator.FoodShop;
import com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.product.Food;

/**
 * 
* Type: FrenchFrieShop
* Description: 
* @author LYM
* @date 2018年11月17日
 */
public class PizzaShop implements FoodShop{
	@Override
	public Food sale() {
		return new Pizza();
	}
}
