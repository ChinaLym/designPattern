package com.lym.designPartten.demo.structType.proxyPattern.staticProxy.subject.impl;

import com.lym.designPartten.demo.structType.proxyPattern.staticProxy.subject.IBehavior;

/**
* Type: Counsellor
* Description: 辅导员类
* @author LYM
* @date 2018年11月27日
 */
public class Counsellor implements IBehavior{

	@Override
	public void doSomething() {
		System.out.println("辅导员正在处理..");
	}
	
}
