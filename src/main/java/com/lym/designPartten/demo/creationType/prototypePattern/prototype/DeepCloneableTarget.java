package com.lym.designPartten.demo.creationType.prototypePattern.prototype;

import java.io.Serializable;
/**
* Type: DeepCloneableTarget
* Description: 对象类（DeepPrototype的属性）
* @author LYM
* @date Dec 20, 2018
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private  String cloneName;

    @SuppressWarnings("unused")
	private String cloneClass;


    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //修改可见性修饰符
    @Override
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}