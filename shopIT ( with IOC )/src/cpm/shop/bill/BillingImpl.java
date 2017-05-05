package cpm.shop.bill;

import cpm.shop.pm.PriceMatrix;

/*
 *   OO principle:
 *   
 *   "closed for modification and open for extension"
 *   
 * 
 *  design and performance issues
 *  -----------------------------
 *  
 *  1. tight-coupling
 *  
 *     --> Maintenance issues , can't extend with new features
 *  
 *  2. too many dependency copies 
 *  
 *    -->  slow , memory/resource usage high
 *  
 *  3. Unit-Testing not possible.
 *  
 *    --> dev slow , cant ensure confidentiality of comp 
 * 
 * 
 *  ---------------------------------------
 *  
 *  
 *  why these issues ?
 *  
 *  -->dependent itself creating its own dependency.
 *  
 *  
 *  soln:
 *  
 *  dont dependency in dependent's class , do lookup.
 *  
 *  limitation on lookup:
 *  
 *  --> location tight-coupling
 *  
 *  best soln:
 *  
 *  --> dont create and lookup dependency in dependent's class , provide/inject by some-one   ( IOC )
 *  
 *  
 *  how to implement IOC ?
 *  
 *  by 'Dependency Injection' ( DI )
 *  
 *  types:
 *  
 *   --> constructor DI
 *   --> setter DI
 * 
 */

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix = null;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	/* (non-Javadoc)
	 * @see cpm.shop.bill.Billing#getTotalPrice(java.lang.String[])
	 */
	@Override
	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}

		return total;

	}
	
	

}
