package com.cubic.retailitemproject;

public class Chocolate extends IceCream {

	private double priceOfChocolate = 5;

	public Chocolate() {
		super(CheckoutItemsNames.CHOCOLATE.toString());
	}

	public double getPriceOfChocolate() {
		return priceOfChocolate;
	}

	public void setPriceOfChocolate(double priceOfChocolate) {
		this.priceOfChocolate = priceOfChocolate;
	}

	@Override
	public double getCost() {

		return getPriceOfIceCream() + priceOfChocolate;
	}

}
