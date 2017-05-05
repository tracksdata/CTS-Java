package com.mr;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class MethodReference_8_4 {

	public static void main(String[] args) {

		// Constructor References

		Supplier<String> func1 = () -> new String();
		Function<String, String> func2 = str -> new String(str);

		func1 = String::new;
		func2 = String::new;

		Supplier<Item> func3 = () -> new Item();
		Function<String, Item> func4 = name -> new Item(name);
		BiFunction<String, Double, Item> func5 = (name, price) -> new Item(name, price);
		System.out.println(func3.get());
		System.out.println(func4.apply("Apple"));
		System.out.println(func5.apply("Apple", 0.75));

		func3 = Item::new;
		func4 = Item::new;
		func5 = Item::new;
		System.out.println(func3.get());
		System.out.println(func4.apply("Apple"));
		System.out.println(func5.apply("Apple", 0.75));
		
		
		
		// Uses a lambda expression
		IntFunction<int[]> arrayCreator1 = size -> new int[size]; 
		int[] empIds1 = arrayCreator1.apply(5); // Creates an int array of five elements
		// Uses an array constructor reference
		IntFunction<int[]> arrayCreator2 = int[]::new; 
		int[] empIds2 = arrayCreator2.apply(5); // Creates an int array of five elements
		
		
		Function<String[],List<String>> asList = Arrays::<String>asList;
		String[] namesArray = {"Jim", "Ken", "Li"};
		List<String> namesList = asList.apply(namesArray);
		for(String name : namesList) {
		System.out.println(name);
		}

	}

}
