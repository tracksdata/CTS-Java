package org.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.example.java8.model.Person;

public class ParallelStream {

	public static void main(String[] args) {

		System.out.println("Creating List");
		List<String> list = new ArrayList<>();

		for (int i = 0; i < 10000; i++) {
			list.add("Item " + i);
		}
		
		list.stream()
		.parallel()
		.forEach(str->System.out.println(str));

	}

}