package com.cubic.retailitemproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckoutRun {

	public static void main(String[] args) throws InputMismatchException {

		CheckoutDetails ckDetails = new CheckoutDetails();

		String choice = "";

		System.out.println("\t!!!!! WELCOME TO NEPALI GROCERY STORE !!!!!\n");

		while (true) {
			ckDetails.input = new Scanner(System.in);
			ckDetails.displayItemTypes();
			choice = ckDetails.getChoice();

			try {
				if (choice.equalsIgnoreCase("X")) {
					System.out.println("!!!!! ::Thank You For Shopping:: !!!!!\n");
					break;
				} else {

					ckDetails.addItem();
					ckDetails.displayReceipt();
					ckDetails.proceedToCheckout();
				}
			} catch (Exception e) {
				System.out.println("   *** You entered the wrong item ***\n   *** Please try again ***\n");
			}
		}

		ckDetails.displayReceipt();
	}
}
