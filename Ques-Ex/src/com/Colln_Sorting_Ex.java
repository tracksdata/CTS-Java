package com;

import java.awt.DisplayMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product> {

	private int id;
	private String name;
	private double price;
	private LocalDate releaseDate;

	@Override
	public int compareTo(Product o) {
		return (int) (this.price - o.price);
	}

	public Product(int id, String name, double price, LocalDate releaseDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.releaseDate = releaseDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", releaseDate=" + releaseDate + "]";
	}

}

public class Colln_Sorting_Ex {

	public static void main(String[] args) {

		Product product1 = new Product(32424, "Laptop", 198000, LocalDate.now());
		Product product2 = new Product(45664, "Mobile", 18000, LocalDate.now().plusMonths(3));
		Product product3 = new Product(45646, "NewOne", 19000, LocalDate.now());

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product1);

		// Collections.sort(products);
		// display(products);

		// sort by 'name'

		Comparator<Product> byName = new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Comparator<Product> byDate = new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getReleaseDate().compareTo(o2.getReleaseDate());
			}
		};

		Collections.sort(products, byDate);

		display(products);

	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
