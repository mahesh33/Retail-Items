package com.cubic.retailitemproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckoutDetailsStore {

	List<RetailItem> listOfItems;

	public List<RetailItem> getListOfItems() {
		return listOfItems;
	}

	public CheckoutDetailsStore() {
		this.listOfItems = new ArrayList<>();
	}

	public void addItem(RetailItem item) {
		listOfItems.add(item);
	}

	public void displayItems() {

		double totalCost = 0;

		Collections.sort(getListOfItems(), new CostComparator());

		for (RetailItem r : listOfItems) {
			System.out.println("Item: " + r.getName() + "Cost: " + r.getCost());
			totalCost += r.getCost();
		}
		System.out.println("Total: " + totalCost + "\n");
	}

	public RetailItem removeLastItem() {

		return listOfItems.remove(listOfItems.size() - 1);
	}
}
