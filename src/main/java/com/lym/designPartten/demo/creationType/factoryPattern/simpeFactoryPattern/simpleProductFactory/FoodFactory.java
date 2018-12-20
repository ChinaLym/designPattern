package com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.simpleProductFactory;

import com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.concreateProduct.FrenchFries;
import com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.product.Food;

/**
 * 
* Type: FoodFactory
* Description: 工厂类
* @author LYM
* @date 2018年11月17日
 */
public class FoodFactory {
	public static Food produceFood(String type) {
		if("FrenchFries".equals(type)) {
			return new FrenchFries();
		}else if("FrenchFries".equals(type)) {
			return new FrenchFries();
		}else if("FrenchFries".equals(type)) {
			return new FrenchFries();
		}else {
			System.out.println("There is no such food in this shop!");
			return new FrenchFries();
		}
	}
}
