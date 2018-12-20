package com.lym.designPartten.demo.structType.proxyPattern.byJDK.subject.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.lym.designPartten.demo.structType.proxyPattern.byJDK.subject.IBehavior;

/**
 * 
* Type: Monitor
* Description: 班长类
* @author LYM
* @date 2018年11月27日
 */
public class Monitor implements InvocationHandler{
	
	IBehavior behavior;
	
	public Monitor(IBehavior behavior) {
		this.behavior = behavior;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("班长接手");
		//传入的是实际对象
		Object returnObject = method.invoke(behavior, args);
		System.out.println("班长反馈给同学");
		return returnObject;
	}

}
