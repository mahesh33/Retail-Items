package com.cubic.retailitemproject;

import java.util.Scanner;

public class CheckoutDetails {

	private CheckoutDetailsStore ckDetailsStore;
	public Scanner input;
	private String customerItemChoice;

	public CheckoutDetailsStore getCkDetailsStore() {
		return ckDetailsStore;
	}

	public void setCkDetailsStore(CheckoutDetailsStore ckDetailsStore) {
		this.ckDetailsStore = ckDetailsStore;
	}

	public CheckoutDetails() {

		this.ckDetailsStore = new CheckoutDetailsStore();
		this.input = new Scanner(System.in);
	}

	public void displayItemTypes() {

		System.out.println(" !!!!! Choose items from below: !!!!!");
		System.out.println("\t1) Potatoes \n\t2) Eggs \n\t3) Icecream\n\tor Enter choice:( X to exit) ");
	}

	public String getChoice() {

		this.customerItemChoice = input.nextLine();
		return this.customerItemChoice;

	}

	private RetailItem getItem() throws ItemNotFoundException {
		if (customerItemChoice.equals("1")) {
			System.out.println("\tChoose the type of Potato: \n\t1) Sweet Potatoes \n\t2) Normal Potatoes\n");

			System.out.println("\t Enter the type of Potato:");
			customerItemChoice = input.nextLine();

			System.out.println("\t Enter the weight of Potato:");
			int weight = input.nextInt();

			if (customerItemChoice.equals("1"))
				return new SweetPotatoes(weight);
			else
				return new NormalPotatoes(weight);
		}

		else if (customerItemChoice.equals("2")) {
			System.out.println("\tChoose the type of Egg: \n\t1) Brown Eggs \n\t2) White Eggs\n");
			customerItemChoice = input.nextLine();

			System.out.println("\t Enter the number of Eggs: ");
			int number = input.nextInt();

			if (customerItemChoice == "1")
				return new BrownEggs(number);
			else
				return new WhiteEggs(number);

		}

		else if (customerItemChoice.equals("3")) {
			System.out.println("\tChoose the type of Icecream: \n\t1) Strawberry \n\t2) Vanilla\n \t3) Chocolate\n");
			customerItemChoice = input.nextLine();

			if (customerItemChoice.equals("1"))
				return new Strawberry();

			else if (customerItemChoice.equals("2"))
				return new Vanilla();

			else
				return new Chocolate();
		}

		else {
			throw new ItemNotFoundException("!!! You choosed the wrong item !!!\n");
		}
	}

	public void addItem() throws ItemNotFoundException {
		RetailItem item = getItem();
		ckDetailsStore.addItem(item);
	}

	public void displayReceipt() {

		System.out.println("\t!!!!! RECEIPT !!!!!");
		ckDetailsStore.displayItems();
	}

	public void removeItem() {

		ckDetailsStore.removeLastItem();
	}

	public void proceedToCheckout() throws ItemNotFoundException {

		System.out.println("Do you want to continue: \t1) Yes \t2) No");
		int userDecision = input.nextInt();

		if (userDecision == 2) {
			removeItem();
			ckDetailsStore.displayItems();

		} else {
			System.out.println("Items was added...");
		}
	}
}
