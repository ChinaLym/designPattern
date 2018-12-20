package com.lym.designPartten.demo.structType.adapterPattern.classAdapterPattern.display;

import com.lym.designPartten.demo.structType.adapterPattern.classAdapterPattern.adapter.UserDaoImpl;
import com.lym.designPartten.demo.structType.adapterPattern.classAdapterPattern.target.UserDao;

/**
 * 
* Type: Display
* Description: 想在原来BaseDaoImpl的基础上新加一个delete功能，原来的功能我还想继续用
* 	适配器目的主要是为了复用
* @author LYM
* @date 2018年11月25日
 */
public class Display {
	
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		userDao.get();
		userDao.getForList();
		userDao.update();
		userDao.delete();
	}
}
