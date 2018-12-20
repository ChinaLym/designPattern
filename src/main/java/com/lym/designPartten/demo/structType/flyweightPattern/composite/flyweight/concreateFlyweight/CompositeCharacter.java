package com.lym.designPartten.demo.structType.flyweightPattern.composite.flyweight.concreateFlyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.lym.designPartten.demo.structType.flyweightPattern.composite.flyweight.AbstractCharacter;

/**
* Type: CompositeCharacter
* Description:复合享元对象 
* @author LYM
* @date 2018年11月27日
 */
public class CompositeCharacter extends AbstractCharacter{

	private Map<String, AbstractCharacter> map = new HashMap<String, AbstractCharacter>();
	
	public CompositeCharacter() {}

	public void add(String key, AbstractCharacter character) {
		map.put(key, character);
	}
	
	@Override
	public void show(String externState) {
		Set<String> set = map.keySet();
		for (String key : set) {
			map.get(key).show(externState);
		}
	}

}
