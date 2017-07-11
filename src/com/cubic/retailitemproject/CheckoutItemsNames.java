package com.cubic.retailitemproject;

public enum CheckoutItemsNames {

	SWEETPOTATOES(1), NORMALPOTATOES(2), BROWNEGGS(3), WHITEEGGS(4), STRAWBERRY(5), VANILLA(6), CHOCOLATE(7);

	private int itemCode;

	private CheckoutItemsNames(int itemCode) { // If we pass int "itemCode"
												// inside the constructor then
												// the value will initialize to
												// enum fields.
		this.itemCode = itemCode;
	}

	public String toString() {
		if (itemCode == 1)
			return "Sweet Potatoes";
		else if (itemCode == 2)
			return "Normal Potatoes";
		else if (itemCode == 3)
			return "Brown Eggs";
		else if (itemCode == 4)
			return "White Eggs";
		else if (itemCode == 5)
			return "Strawberry";
		else if (itemCode == 6)
			return "Vanilla";
		return "Chocolate";

	}
}
