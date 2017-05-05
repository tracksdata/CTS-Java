package com.samples;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.model.Person;

public class Stream_Wrappers {

	public static void main(String[] args) {

		List<String> names = Person
				.persons()
				.stream()
				.map(Person::getName)
				.sorted()
				.collect(
						Collectors.collectingAndThen(Collectors.toList(),
								result -> Collections.unmodifiableList(result)));

		names.add("UnknonName");

		System.out.println(names);
		
		

		
	}

}
