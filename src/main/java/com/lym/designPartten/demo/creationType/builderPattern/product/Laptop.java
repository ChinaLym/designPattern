package com.lym.designPartten.demo.creationType.builderPattern.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Laptop {
	protected List<String> parts = new ArrayList<String>();
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		for (String part : parts) {
			System.out.println(part + "\t");
		}
	}
}
