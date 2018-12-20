package com.lym.designPartten.demo.structType.flyweightPattern.simple.flyweightFactory;

import java.util.HashMap;
import java.util.Map;

import com.lym.designPartten.demo.structType.flyweightPattern.simple.flyweight.AbstractCharacter;
import com.lym.designPartten.demo.structType.flyweightPattern.simple.flyweight.concreateFlyweight.Character;

/**
* Type: CharacterFactory
* Description: 享元工厂类(单例)
* @author LYM
* @date 2018年11月27日
 */
public class CharacterFactory {
	//饿汉式单例模式
	private static CharacterFactory instance = new CharacterFactory();
	private CharacterFactory() {}
	public static CharacterFactory getInstance() {
		return instance;
	}
	
	private Map<String, AbstractCharacter> cache = new HashMap<String, AbstractCharacter>();
	public static final String CHAR_A = "A";
	public static final String CHAR_B = "B";
	
	public AbstractCharacter getCharacter(String key) {
		AbstractCharacter character = cache.get(key);
		if(character != null) {
			return character;
		}else if (key == null || key.length() != 1 ) {
			return null;
		}
		character = new Character(key.charAt(0));
		cache.put(key, character);
		return character;
	}
	//用作测试内存开辟和对象生成个数
	public int getCacheSize() {
		return cache.size();
	}
}
