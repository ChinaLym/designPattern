package com.lym.designPartten.demo.creationType.builderPattern.builder;

import com.lym.designPartten.demo.creationType.builderPattern.product.Laptop;

public interface LaptopBuilder {
	public void builderCPU();
	
	public void builderMemory();
	
	public void builderDisplayCard();
	
	public Laptop getFinalResult();
	
}
