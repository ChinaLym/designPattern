package com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.display;

import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractFactory.IShop;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.Laptop;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct.MobilePhone;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateFactory.HUAWEIShop;
import com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.concreateFactory.MIShop;

/**
 * 不论简单工厂模式还是改进后的工厂方法模式，一种工厂只有一种产品，而实际中，产品可以按照类型划分，
 * 如花费为手机、笔记本，也可以按照品牌划分，如华为设备，小米设备，为了解决这种情况，引入抽象工厂模式
 * 该模式适合情况：产品有多种，且有不同品牌（如肯德基和麦当劳都卖饮料和甜筒）
* Type: Display
* Description: 
* @author LYM
* @date 2018年11月24日
 */
public class Display {
	public static void main(String[] args) {
		IShop HUAWEI_Shop = new HUAWEIShop();
		Laptop huawei_Laptop = HUAWEI_Shop.getLaptop();
		huawei_Laptop.getId();
		MobilePhone huawei_MobilePhone = HUAWEI_Shop.getMobilePhone();
		huawei_MobilePhone.active();
		
		IShop MI_Shop = new MIShop();
		Laptop MI_Laptop = MI_Shop.getLaptop();
		MI_Laptop.getId();
		MobilePhone MI_MobilePhone = MI_Shop.getMobilePhone();
		MI_MobilePhone.active();
	}
}
