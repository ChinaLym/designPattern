package com.lym.designPartten.demo.structType.proxyPattern.staticProxy.subject.impl;

import com.lym.designPartten.demo.structType.proxyPattern.staticProxy.subject.IBehavior;

/**
 * 
* Type: Monitor
* Description: 班长类
* @author LYM
* @date 2018年11月27日
 */
public class Monitor implements IBehavior{

	IBehavior behavior;
	
	public Monitor(IBehavior behavior) {
		this.behavior = behavior;
	}
	@Override
	public void doSomething() {
		System.out.println("班长接手");
		behavior.doSomething();
		System.out.println("班长反馈给同学");
	}
}
