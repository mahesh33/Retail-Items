package com.cubic.retailitemproject;

public class Vanilla extends IceCream {

	private double priceOfVanilla = 3;

	public Vanilla() {
		super(CheckoutItemsNames.VANILLA.toString());
	}

	@Override
	public double getCost() {
		return getPriceOfIceCream() + priceOfVanilla;
	}

	public double getPriceOfVanilla() {
		return priceOfVanilla;
	}

	public void setPriceOfVanilla(double priceOfVanilla) {
		this.priceOfVanilla = priceOfVanilla;
	}

}
