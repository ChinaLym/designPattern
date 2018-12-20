package com.lym.designPartten.demo.creationType.prototypePattern.display;

import com.lym.designPartten.demo.creationType.prototypePattern.prototype.DeepPrototype;

/**
 * 
 * Type: Display
 * Description:
 * 浅克隆使用jdk native 方法clone，完成内存地址的拷贝，然后设置变动的属性，
 * 对于创建时花费资源较为严重的类，或对象大部分属性相同时，使用该模式会提升创建效率。
 *  缺点：违背开闭原则
 *  		如果为多重嵌套引用对象，则需要都进行重写clone方法时，
 *  				这里推荐用序列化的方式来实现深克隆，而不必每个引用对象都要重写clone方法。
 * @author LYM,sunkang
 * @date 2018年11月24日
 */
public class Display {
	public static void main(String[] args) {
		DeepPrototype p = new DeepPrototype();
		p.name="kang";

		p.deepCloneableTarget = new com.lym.designPartten.demo.creationType.prototypePattern.prototype.DeepCloneableTarget("clone","CloneableTarget");
		System.out.println("原有的对象："+p);
		System.out.println("原有的值对象引用："+p.name.hashCode());
		System.out.println("原有的引用类型对象："+p.deepCloneableTarget);

		try {
			//方式一 ：通过重写clone()方法进行浅拷贝
			DeepPrototype clonePrototype = (DeepPrototype) p.clone();
			System.out.println("clone()方法克隆的对象："+clonePrototype);
			System.out.println("clone()方法克隆的值对象引用："+p.name.hashCode());
			System.out.println("clone()方法克隆的引用类型对象："+ clonePrototype.deepCloneableTarget);

			//方式二：  通过对象序列化实现深拷贝
			DeepPrototype  serializableClone= (DeepPrototype) p.deepClone();
			System.out.println("序列化方法克隆的对象："+serializableClone);
			System.out.println("构序列化方法克隆的值对象引用："+serializableClone.name.hashCode());
			System.out.println("序列化方法克隆的引用类型对象："+ serializableClone.deepCloneableTarget);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
