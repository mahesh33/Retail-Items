package com.cubic.retailitemproject;

public abstract class IceCream extends RetailItem {

	private double priceOfIceCream = 10;

	public IceCream(String name) {
		super(name);
	}

	public double getPriceOfIceCream() {
		return priceOfIceCream;
	}

	public void setPriceOfIceCream(double priceOfIceCream) {
		this.priceOfIceCream = priceOfIceCream;
	}

}
