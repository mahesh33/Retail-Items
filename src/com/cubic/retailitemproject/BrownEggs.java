package com.cubic.retailitemproject;

public class BrownEggs extends Eggs {

	private double pricePerDozenOfBrownEggs = 2.5;

	public BrownEggs(double numberOfEggs) {
		super(CheckoutItemsNames.BROWNEGGS.toString(), numberOfEggs);
	}

	@Override
	public double getCost() {
		return getNumberOfEggs() + pricePerDozenOfBrownEggs;
	}

	public double getPricePerDozenOfBrownEggs() {
		return pricePerDozenOfBrownEggs;
	}

	public void setPricePerDozenOfBrownEggs(double pricePerDozenOfBrownEggs) {
		this.pricePerDozenOfBrownEggs = pricePerDozenOfBrownEggs;
	}

}
