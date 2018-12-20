package com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateFactory;

import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractFactory.IShop;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.Laptop;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.MobilePhone;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateProduct.MILaptop;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateProduct.MIMobilePhone;

public class MIShop implements IShop{

	@Override
	public MobilePhone getMobilePhone() {
		return new MIMobilePhone();
	}

	@Override
	public Laptop getLaptop() {
		return new MILaptop();
	}

}
