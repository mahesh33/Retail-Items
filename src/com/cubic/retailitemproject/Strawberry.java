package com.cubic.retailitemproject;

public class Strawberry extends IceCream {

	private double priceOfStrawberry = 4;

	public Strawberry() {
		super(CheckoutItemsNames.STRAWBERRY.toString());
	}

	@Override
	public double getCost() {
		return getPriceOfIceCream() + priceOfStrawberry;
	}

	public double getPriceOfStrawberry() {
		return priceOfStrawberry;
	}

	public void setPriceOfStrawberry(double priceOfStrawberry) {
		this.priceOfStrawberry = priceOfStrawberry;
	}

}
