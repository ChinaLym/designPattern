package com.lym.designPartten.demo.structType.proxyPattern.staticProxy.display;

import com.lym.designPartten.demo.structType.proxyPattern.staticProxy.subject.IBehavior;
import com.lym.designPartten.demo.structType.proxyPattern.staticProxy.subject.impl.Counsellor;
import com.lym.designPartten.demo.structType.proxyPattern.staticProxy.subject.impl.Monitor;

/**
* Type: Display
* Description: 静态代理
* @author LYM
* @date 2018年11月27日
 */
public class Display {
	
	public static void main(String[] args) {
		//表示让班长代理辅导员处理事情
		IBehavior monitor = new Monitor(new Counsellor());
		monitor.doSomething();
	}
}
