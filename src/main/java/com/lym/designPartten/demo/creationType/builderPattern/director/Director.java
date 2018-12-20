package com.lym.designPartten.demo.creationType.builderPattern.director;

import com.lym.designPartten.demo.creationType.builderPattern.builder.LaptopBuilder;

public class Director {
	private LaptopBuilder builder;

	public Director(LaptopBuilder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.builderCPU();
		builder.builderMemory();
		builder.builderDisplayCard();
	}
	
}
