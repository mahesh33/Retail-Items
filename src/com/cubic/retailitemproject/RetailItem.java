package com.cubic.retailitemproject;

public abstract class RetailItem {

	private String name;

	public RetailItem(String name) {
		super();
		this.setName(name);
	}
	
	public abstract double getCost();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
