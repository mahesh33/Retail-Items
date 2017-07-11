package com.cubic.retailitemproject;

public class NormalPotatoes extends Potatoes {
	private double pricePerLbOfNormalPotatoes = .5;

	public NormalPotatoes(double weight) {
		super(CheckoutItemsNames.NORMALPOTATOES.toString(), weight);
	}

	@Override
	public double getCost() {
		return getWeight() + pricePerLbOfNormalPotatoes;
	}

}
