package com.lym.designPartten.demo.creationType.builderPattern.builder.impl;

import com.lym.designPartten.demo.creationType.builderPattern.builder.LaptopBuilder;
import com.lym.designPartten.demo.creationType.builderPattern.product.Laptop;
import com.lym.designPartten.demo.creationType.builderPattern.product.impl.HUAWEILaptop;

public class HUAWEIBuilder implements LaptopBuilder{

	private HUAWEILaptop laptop = new HUAWEILaptop();
	@Override
	public void builderCPU() {
		laptop.add("酷睿 i7 xxx CPU");
	}

	@Override
	public void builderMemory() {
		laptop.add("DDR3 1600MHz 8G 内存");
	}

	@Override
	public void builderDisplayCard() {
		laptop.add("NVIDIA GTX 1080 显卡");
	}
	
	@Override
	public Laptop getFinalResult() {
		return laptop;
	}

}
