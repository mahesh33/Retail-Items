package com.cubic.retailitemproject;

public abstract class Potatoes extends RetailItem {

	private double weight;

	public Potatoes(String name, double weight) {
		super(name);
		this.setWeight(weight);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
