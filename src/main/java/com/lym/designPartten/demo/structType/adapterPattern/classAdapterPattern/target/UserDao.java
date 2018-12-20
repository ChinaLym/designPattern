package com.lym.designPartten.demo.structType.adapterPattern.classAdapterPattern.target;
/**
 * 
* Type: UserDao
* Description: 想在原来的基础上新加一个delete功能
* @author LYM
* @date 2018年11月25日
 */
public interface UserDao {

	void getForList();

	void get();

	void update();

	void delete();

}
