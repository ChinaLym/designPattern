package com.lym.designPartten.demo.structType.decoratorPattern.component;

/**
 * 
* Type: Food
* Description: 抽象食物，所有食物的父类
* @author LYM
* @date 2018年11月25日
 */
public abstract class AbstractFood {
	public String description = "Unkown";
	public String getDescription() {
		return this.description;
	}
	public abstract double price();
}
