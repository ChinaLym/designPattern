package com.lym.designPartten.demo.structType.proxyPattern.byCglib.display;

import com.lym.designPartten.demo.structType.proxyPattern.byCglib.subject.impl.Counsellor;
import com.lym.designPartten.demo.structType.proxyPattern.byCglib.subject.impl.Monitor;

import net.sf.cglib.proxy.Enhancer;

/**
* Type: Display
* Description: cglib动态代理：通过实现同一个接口，用通过访问代理对象，来间接访问真实对象
* 	这里举例子：班内同学对某个通知不理解，想找辅导员询问，但是不能直接找（访问）辅导员
* 		需要通过班长去找辅导员询问。
* 	cglib动态代理时，无需实际对象实现接口，但不支持final类。
* @author LYM
* @date 2018年11月27日
 */
public class Display {
	public static void main(String[] args) {
		Counsellor counsellor = new Counsellor();
		Monitor monitor = new Monitor(counsellor);
	    Enhancer enhancer = new Enhancer(); //创建加强器，用来创建动态代理类
	    enhancer.setSuperclass(counsellor.getClass());  //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
	    enhancer.setCallback(monitor); 
	    Object object = enhancer.create(); 
	       
	    ((Counsellor)object).doSomething();
	}
}
