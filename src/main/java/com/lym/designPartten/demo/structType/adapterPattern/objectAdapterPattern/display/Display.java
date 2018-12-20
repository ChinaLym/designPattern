package com.lym.designPartten.demo.structType.adapterPattern.objectAdapterPattern.display;

import com.lym.designPartten.demo.structType.adapterPattern.objectAdapterPattern.adaptee.Usb;
import com.lym.designPartten.demo.structType.adapterPattern.objectAdapterPattern.adapter.UsbToDoubleFoot;
import com.lym.designPartten.demo.structType.adapterPattern.objectAdapterPattern.target.DoubleFoot;

/**
 * 
* Type: Display
* Description: 我有一个Usb手机数据线，现在我想给手机充电但是我没有带笔记本，
* 	现在旁边只有一个双孔插座，所以我需要一个usb转双脚插头的电源适配器
* @author LYM
* @date 2018年11月25日
 */
public class Display {
	public static void main(String[] args) {
		//我现在有一个双孔插座
		DoubleSocket doubleSocket = new DoubleSocket();
		//我现在有一条usb充电线
		Usb usb = new Usb();
		//但是我现在没法充电
		
		//使用适配器，连上我的线
		DoubleFoot doubleFoot = new UsbToDoubleFoot(usb);
		//给手机充电
		doubleSocket.providePower(doubleFoot);
	}
}
