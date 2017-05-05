package com.set;

import java.util.Set;
import java.util.TreeSet;

import com.model.Product;

public class TreeSet_Ex {

	public static void main(String[] args) {

		Product product1 = new Product(423123, "Laptop", 198000);
		Product product2 = new Product(353443, "Apple", 19000);
		Product product3 = new Product(153443, "Mobile", 9000);

		Set<Product> products = new TreeSet<>((o1,o2)->{return o2.getName().compareTo(o1.getName());});
		products.add(product1);
		products.add(product2);
		products.add(product3);

		for (Product product : products) {
			System.out.println(product);
		}

	}

}
