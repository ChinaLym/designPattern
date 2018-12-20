package com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateFactory;

import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractFactory.IShop;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.Laptop;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.MobilePhone;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateProduct.HUAWEILaptop;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateProduct.HUAWEIMobilePhone;

public class HUAWEIShop implements IShop{

	@Override
	public MobilePhone getMobilePhone() {
		return new HUAWEIMobilePhone();
	}

	@Override
	public Laptop getLaptop() {
		return new HUAWEILaptop();
	}

}
