package com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.concreateProduct;

import com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.product.Food;

/**
 * 
* Type: Pizza
* Description: 披萨
* @author LYM
* @date 2018年11月17日
 */
public class Pizza  implements Food{

	@Override
	public void show() {
		System.out.println("Pizza!");
	}

}
