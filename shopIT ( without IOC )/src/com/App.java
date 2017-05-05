package com;

import cpm.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init

		BillingImpl billing = new BillingImpl();

		// use
		String[] cart = { "1212", "231313" };
		double totalPrice = billing.getTotalPrice(cart);
		System.out.println("total price : " + totalPrice);

		// destroy
		billing = null;

	}

}
