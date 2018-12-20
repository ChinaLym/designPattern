package com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateProduct;

import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.Laptop;

public class HUAWEILaptop extends Laptop{

	private final static String BRAND = "HUAWEI";
	
	public HUAWEILaptop() {
		super(BRAND);
	}

}
