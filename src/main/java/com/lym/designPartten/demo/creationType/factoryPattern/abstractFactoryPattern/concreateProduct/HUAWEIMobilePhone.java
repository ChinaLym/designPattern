package com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateProduct;

import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.MobilePhone;

public class HUAWEIMobilePhone extends MobilePhone{

	@Override
	public void active() {
		System.out.println("HUAWEI phone is active.");
	}

}
