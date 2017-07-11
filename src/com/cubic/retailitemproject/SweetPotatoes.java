package com.cubic.retailitemproject;

public class SweetPotatoes extends Potatoes {
	private double pricePerLbOfSweetPotatoes = 1.5;

	public SweetPotatoes(double weight) {
		super(CheckoutItemsNames.SWEETPOTATOES.toString(), weight);
	}

	@Override
	public double getCost() {
		return getWeight() * pricePerLbOfSweetPotatoes;
	}

}
