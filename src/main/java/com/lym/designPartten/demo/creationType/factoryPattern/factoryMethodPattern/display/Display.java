package com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.display;

import com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.concreateCreator.FrenchFrieShop;
import com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.concreateCreator.HamburgerShop;
import com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.concreateCreator.PizzaShop;
import com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.creator.FoodShop;
import com.lym.designPartten.demo.creationType.factoryPattern.factoryMethodPattern.product.Food;

/**
 * 
* Type: Display
* Description: Show how to use this pattern.
* 工厂方法模式,虽然简单工厂模式简单好用，但它严重违反了开闭原则
* （对扩展开放，对修改封闭——原因：所有类全在一个工厂类中，耦合太高，需要频繁修改工厂类），
* 因此，引入工厂方法模式来完美解决该问题。
* 代价是若增加一种产品则需要额外写一个工厂，增加了代码量和更难理解。
* @author LYM
* @date 2018年11月17日
 */
public class Display {
	public static void main(String[] args) {
		FoodShop f1 = new FrenchFrieShop();
		Food food1 = f1.sale();
		Food food2 = f1.sale();
		food1.getDescription();
		System.out.println(food1.getId());
		food2.getDescription();
		System.out.println(food2.getId());
		
		FoodShop f2 = new HamburgerShop();
		Food food3 = f2.sale();
		Food food4 = f2.sale();
		food3.getDescription();
		System.out.println(food3.getId());
		food4.getDescription();
		System.out.println(food4.getId());
		
		FoodShop f3 = new PizzaShop();
		Food food5 = f3.sale();
		food5.getDescription();
		System.out.println(food5.getId());
	}
}
