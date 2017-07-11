package com.cubic.retailitemproject;

public class WhiteEggs extends Eggs {

	private double pricePerDozenOfWhiteEggs = 1.5; 
	
	public WhiteEggs(double numberOfEggs) {
		super(CheckoutItemsNames.WHITEEGGS.toString(), numberOfEggs);
	}

	@Override
	public double getCost() {
		return getNumberOfEggs() * pricePerDozenOfWhiteEggs;
	}

	public double getPricePerDozenOfWhiteEggs() {
		return pricePerDozenOfWhiteEggs;
	}

	public void setPricePerDozenOfWhiteEggs(double pricePerDozenOfWhiteEggs) {
		this.pricePerDozenOfWhiteEggs = pricePerDozenOfWhiteEggs;
	}

}
