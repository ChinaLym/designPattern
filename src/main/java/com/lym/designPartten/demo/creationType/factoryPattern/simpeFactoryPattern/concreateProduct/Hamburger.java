package com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.concreateProduct;

import com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.product.Food;

/**
 * 
* Type: Hamburger
* Description: 汉堡
* @author LYM
* @date 2018年11月17日
 */
public class Hamburger  implements Food{

	@Override
	public void show() {
		System.out.println("Hamburger!");
	}

}
