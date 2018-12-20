package com.lym.designPartten.demo.structType.adapterPattern.classAdapterPattern.adaptee;

/**
 * 
* Type: BaseDaoImpl
* Description:Adaptee，原来的类 
* @author LYM
* @date 2018年11月25日
 */
public class BaseDaoImpl {

	public void getForList()  {
		System.out.println("原始功能：getForList");
	}

	public void get()  {
		System.out.println("原始功能：get");
	}

	public void update()  {
		System.out.println("原始功能：update");
	}


}
