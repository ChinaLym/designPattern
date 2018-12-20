package com.lym.designPartten.demo.creationType.builderPattern.display;

import com.lym.designPartten.demo.creationType.builderPattern.builder.LaptopBuilder;
import com.lym.designPartten.demo.creationType.builderPattern.builder.impl.HUAWEIBuilder;
import com.lym.designPartten.demo.creationType.builderPattern.builder.impl.MIBuilder;
import com.lym.designPartten.demo.creationType.builderPattern.director.Director;
import com.lym.designPartten.demo.creationType.builderPattern.product.Laptop;

/**
 * 
* Type: Display
* Description:
* 	创建者模式适合将不同的产品的复杂的制造流程流程抽取出来，
*  并以可以强制一定的生产加工顺序，来组合成一个产品（对象）。 
* @author LYM
* @date 2018年11月24日
 */
public class Display {
	private final static LaptopBuilder
		huawei_laptopBuilder = new HUAWEIBuilder(),
		xiaomi_laptopBuilder = new MIBuilder();
	
	public static void main(String[] args) {
		System.out.println("HUAWEI -------------");
		Director director = new Director(huawei_laptopBuilder);
		director.construct();
		Laptop laptop = huawei_laptopBuilder.getFinalResult();
		laptop.show();
		
		System.out.println("XIAOMI -------------");
		director = new Director(xiaomi_laptopBuilder);
		director.construct();
		laptop = xiaomi_laptopBuilder.getFinalResult();
		laptop.show();
	}
}
