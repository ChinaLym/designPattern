package com.lym.designPartten.demo.creationType.singletonPattern.dispaly;

import com.lym.designPartten.demo.creationType.singletonPattern.enumType.EnumSingleton;
import com.lym.designPartten.demo.creationType.singletonPattern.hungry.HungrySingleton1;
import com.lym.designPartten.demo.creationType.singletonPattern.hungry.HungrySingleton2;
import com.lym.designPartten.demo.creationType.singletonPattern.lazy.LazySingleton1;
import com.lym.designPartten.demo.creationType.singletonPattern.lazy.LazySingleton2;

/**
 * 
* Type: Dispaly
* Description:
* show how to get their instance, and all of them are thread-safe.
* @author LYM
* @date 2018年11月23日
 */
public class Dispaly {
	public static void main(String[] args) {
		System.out.println(EnumSingleton.INSTANCE);
		
		HungrySingleton1 hungrySingleton1 = HungrySingleton1.getInstance();
		HungrySingleton1 hungrySingleton1_c = HungrySingleton1.getInstance();
		System.out.println(hungrySingleton1 == hungrySingleton1_c);
		
		HungrySingleton2 hungrySingleton2 = HungrySingleton2.getInstance();
		HungrySingleton2 hungrySingleton2_c = HungrySingleton2.getInstance();
		System.out.println(hungrySingleton2 == hungrySingleton2_c);
		
		System.out.println("-----------------------------");
		
		LazySingleton1 lazySingleton1 = LazySingleton1.getInstance();
		LazySingleton1 lazySingleton1_c = LazySingleton1.getInstance();
		System.out.println(lazySingleton1 == lazySingleton1_c);
		
		LazySingleton2 lazySingleton2 = LazySingleton2.getInstance();
		LazySingleton2 lazySingleton2_c = LazySingleton2.getInstance();
		System.out.println(lazySingleton2 == lazySingleton2_c);
		
		
		
	}
}
