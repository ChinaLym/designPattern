package com.lym.designPartten.demo.structType.flyweightPattern.composite.display;

import java.util.Arrays;

import com.lym.designPartten.demo.structType.flyweightPattern.composite.flyweight.AbstractCharacter;
import com.lym.designPartten.demo.structType.flyweightPattern.composite.flyweightFactory.CharacterFactory;

/**
* Type: Display
* Description:复合享元模式 
* @author LYM
* @date 2018年11月27日
 */
public class Display {
	public static void main(String[] args) {
		CharacterFactory factory = CharacterFactory.getInstance();
		AbstractCharacter character1 = factory.getCharacter(CharacterFactory.CHAR_A);
		character1.show("字体：微软雅黑");
		AbstractCharacter character2 = factory.getCharacter(CharacterFactory.CHAR_B);
		character2.show("大小：22px");
		AbstractCharacter character3 = factory.getCharacter(CharacterFactory.CHAR_A);
		character3.show("字体：黑体");
		AbstractCharacter character4 = factory.getCharacter(Arrays.asList(new String[] {
				"A","B","B","A","A"
		}));
		character4.show("大小：12px");
		
		System.out.println("享元对象总个数：" + factory.getCacheSize());
	}
}
