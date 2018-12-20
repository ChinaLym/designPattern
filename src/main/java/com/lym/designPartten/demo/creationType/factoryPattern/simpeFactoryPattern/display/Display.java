package com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.display;

import com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.product.Food;
import com.lym.designPartten.demo.creationType.factoryPattern.simpeFactoryPattern.simpleProductFactory.FoodFactory;

/**
 * 
* Type: Display
* Description: Show how to use this pattern.
* 简单工厂模式，不属于23种GOF设计模式之一
* if this demo is easy for you， try to use this pattern in your projects like messageSender..
* and transform it to factoryMethodPattern.
* @author LYM
* @date 2018年11月17日
 */
public class Display {
	public static void main(String[] args) {
		Food myPizza = FoodFactory.produceFood("Pizza");
		myPizza.show();
		Food hamburger = FoodFactory.produceFood("Hamburger");
		hamburger.show();
		Food drumsticks = FoodFactory.produceFood("Drumsticks");
		drumsticks.show();
		
	}
}
