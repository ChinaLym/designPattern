package com.lym.designPartten.demo.structType.proxyPattern.byCglib.subject.impl;

/**
* Type: Counsellor
* Description: 辅导员类，cglib不必须实现接口
* @author LYM
* @date 2018年11月27日
 */
public class Counsellor /*implements IBehavior*/{

	public void doSomething() {
		System.out.println("辅导员正在处理..");
	}
	
}
