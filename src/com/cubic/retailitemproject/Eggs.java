package com.cubic.retailitemproject;

public abstract class Eggs extends RetailItem {

	private double numberOfEggs;

	public Eggs(String name, double numberOfEggs) {
		super(name);
		this.numberOfEggs = numberOfEggs;
	}

	public double getNumberOfEggs() {
		return numberOfEggs;
	}

	public void setNumberOfEggs(double numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

}
