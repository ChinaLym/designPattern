package com.lym.designPartten.demo.structType.adapterPattern.classAdapterPattern.adapter;

import com.lym.designPartten.demo.structType.adapterPattern.classAdapterPattern.adaptee.BaseDaoImpl;
import com.lym.designPartten.demo.structType.adapterPattern.classAdapterPattern.target.UserDao;

public class UserDaoImpl extends BaseDaoImpl implements UserDao{
	
	@Override
	public void delete() {
		System.out.println("新功能：delete");
	}
	
}
