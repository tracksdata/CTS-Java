package com;

import cpm.shop.bill.Billing;
import cpm.shop.bill.BillingImpl;
import cpm.shop.pm.PriceMatrix;
import cpm.shop.pm.PriceMatrixImpl_v1;
import cpm.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// init
		PriceMatrix priceMatrix1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrix2 = new PriceMatrixImpl_v2();
		Billing billing1 = new BillingImpl(priceMatrix1);
		Billing billing2 = new BillingImpl(priceMatrix2);

		// use
		String[] cart = { "1212", "231313" };
		double totalPrice = billing1.getTotalPrice(cart);
		System.out.println("total price : " + totalPrice);

		// destroy

	}

}
