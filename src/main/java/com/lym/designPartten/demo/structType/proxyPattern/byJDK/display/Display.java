package com.lym.designPartten.demo.structType.proxyPattern.byJDK.display;

import java.lang.reflect.Proxy;

import com.lym.designPartten.demo.structType.proxyPattern.byJDK.subject.IBehavior;
import com.lym.designPartten.demo.structType.proxyPattern.byJDK.subject.impl.Counsellor;
import com.lym.designPartten.demo.structType.proxyPattern.byJDK.subject.impl.Monitor;

/**
* Type: Display
* Description: 通过实现JDK中InvocationHandler来实现代理，需要代理类实现接口，可动态
* @author LYM
* @date 2018年11月27日
 */
public class Display {

	public static void main(String[] args) {
		IBehavior counsellor = new Counsellor();
		//表示让班长代理辅导员处理事情
		IBehavior monitor = (IBehavior) Proxy.newProxyInstance(
				counsellor.getClass().getClassLoader(),
				counsellor.getClass().getInterfaces(),
                new Monitor(counsellor)
        );
		monitor.doSomething();
	}
}
