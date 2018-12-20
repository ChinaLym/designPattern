package com.lym.designPartten.demo.structType.decoratorPattern.display;

import com.lym.designPartten.demo.structType.decoratorPattern.component.AbstractFood;
import com.lym.designPartten.demo.structType.decoratorPattern.component.concreateComponent.Pancake;
import com.lym.designPartten.demo.structType.decoratorPattern.decorator.concreateDecorator.DriedMeatFloss;
import com.lym.designPartten.demo.structType.decoratorPattern.decorator.concreateDecorator.Youtiao;

/**
 * 
* Type: Display
* Description: 装饰者模式使用可以动态的扩展类功能，也可以动态地撤销，避免类爆炸。
* 适用场景简单举例：同一个型号的笔记本或手机可能配置不同，有的是32G版，有的是64G版，有的128G；
* 买手机可以选择套餐，套餐一：裸机，套餐二：加x元送手机壳，套餐三...；
* 点餐自由组合配料等。
* 	
* 比继承灵活，但更复杂。
* 针对的是抽象类，如果针对具体的组件，要考虑是否用该模式。
* @author LYM
* @date 2018年11月25日
 */
public class Display {
	
	public static void main(String[] args) {
		
		// A：“老板，来一份煎饼，啥都不用加！”
		AbstractFood foodA = new Pancake();
		System.out.println("A的点餐为：" + foodA.getDescription() + "。价格为：" + foodA.price());

		// B：“老板，来一份煎饼，加油条！”
		AbstractFood foodB = new Pancake();
		foodB = new Youtiao(foodB);
		System.out.println("B的点餐为：" + foodB.getDescription() + "。价格为：" + foodB.price());

		// C：“老板，来一份煎饼，加两份油条，加肉松！”
		AbstractFood foodC = new Pancake();
		foodC = new Youtiao(foodC);
		foodC = new Youtiao(foodC);
		foodC = new DriedMeatFloss(foodC);
		System.out.println("C的点餐为：" + foodC.getDescription() + "。价格为：" + foodC.price());

	}
}
