package com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateProduct;

import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.MobilePhone;

public class MIMobilePhone extends MobilePhone {

	@Override
	public void active() {
		System.out.println("XIAOMI phone is active.");
	}

}
