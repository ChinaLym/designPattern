package com.lym.designPartten.demo.structType.flyweightPattern.simple.display;

import com.lym.designPartten.demo.structType.flyweightPattern.simple.flyweight.AbstractCharacter;
import com.lym.designPartten.demo.structType.flyweightPattern.simple.flyweightFactory.CharacterFactory;

/**
* Type: Display
* Description: 单纯享元模式
* 	如围棋中有很多棋子对象，但只分黑白两种，这里就可以用享元模式。
* 	如文本编辑器，有很多相同的字符，只是可能字体大小不同，可用享元模式。
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
		AbstractCharacter character4 = factory.getCharacter(CharacterFactory.CHAR_B);
		character4.show("字体：宋体;大小：20px");
		
		System.out.println("享元对象总个数：" + factory.getCacheSize());
	}
}
