package com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateProduct;

import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.Laptop;

public class MILaptop extends Laptop {

	private final static String BRAND = "XIAOMI";
	
	public MILaptop() {
		super(BRAND);
	}

}
