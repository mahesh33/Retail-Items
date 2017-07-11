package com.cubic.retailitemproject;

import java.util.Comparator;

public class CostComparator implements Comparator<RetailItem> {

	@Override
	public int compare(RetailItem cost1, RetailItem cost2) {

		if (cost1.getCost() > cost2.getCost())
			return 1;
		if (cost1.getCost() < cost2.getCost())
			return -1;
		else
			return 0;

	}

}
