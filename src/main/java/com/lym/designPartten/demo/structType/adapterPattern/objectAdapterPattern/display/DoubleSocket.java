package com.lym.designPartten.demo.structType.adapterPattern.objectAdapterPattern.display;

import com.lym.designPartten.demo.structType.adapterPattern.objectAdapterPattern.target.DoubleFoot;

/**
 * 双孔插座，只能供双脚使用
* Type: DoubleSocket
* Description: 
* @author LYM
* @date 2018年11月25日
 */
public class DoubleSocket {
	//供电
	public void providePower(DoubleFoot doubleFoot) {
		doubleFoot.useDoubleFootCharge();
	}
}
