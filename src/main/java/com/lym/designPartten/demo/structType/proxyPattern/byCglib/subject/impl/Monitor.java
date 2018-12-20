package com.lym.designPartten.demo.structType.proxyPattern.byCglib.subject.impl;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 
* Type: Monitor
* Description: 班长类
* @author LYM
* @date 2018年11月27日
 */
public class Monitor implements MethodInterceptor{

	Counsellor behavior;
	
	public Monitor(Counsellor behavior) {
		this.behavior = behavior;
	}
	
	 // 实现回调方法 
	@Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable { 
    	System.out.println("班长接手");
        proxy.invokeSuper(obj, args); //调用业务类（父类中）的方法
        System.out.println("班长反馈给同学");
        return null; 
    }

}
