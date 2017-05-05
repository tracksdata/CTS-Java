package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.model.Product;

public class List_Sorting_Demo {

	public static void main(String[] args) {

		Product product1 = new Product(423123, "Laptop", 198000);
		Product product2 = new Product(353443, "Apple", 19000);
		Product product3 = new Product(153443, "Mobile", 9000);

		// ----------------------------------------------------------

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);

		// ----------------------------------------------------------

		// display(products);

		// ----------------------------------------------------------

		// Collections.sort(products);
		// display(products);

		// ----------------------------------------------------------

		String sortBy = "name";
		
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		display(products);

	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
