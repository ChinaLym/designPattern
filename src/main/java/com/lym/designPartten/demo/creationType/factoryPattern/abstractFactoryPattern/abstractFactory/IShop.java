package com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractFactory;

import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.Laptop;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.MobilePhone;

public interface IShop {
	public MobilePhone getMobilePhone();
	
	public Laptop getLaptop();
}
