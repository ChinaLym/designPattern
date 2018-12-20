package com.lym.designPartten.demo.creationType.factoryPattern.abstractFactoryPattern.abstractProduct;

public abstract class Laptop {
	private String brand;
	public Laptop(String brand) {
		this.brand = brand;
	}
	public void getId() {
		System.out.println("this is a " + brand + " Latop");
	}
}
