package com.lym.designPartten.demo.structType.flyweightPattern.composite.flyweight.concreateFlyweight;

import com.lym.designPartten.demo.structType.flyweightPattern.composite.flyweight.AbstractCharacter;

public class Character extends AbstractCharacter{

	private char value;
	
	public Character(char internalState) {
		this.value = internalState;
	}
	@Override
	public void show(String externState) {
		System.out.println("字母：" + this.value + ";外部状态【" + externState + "】");
	}

}
