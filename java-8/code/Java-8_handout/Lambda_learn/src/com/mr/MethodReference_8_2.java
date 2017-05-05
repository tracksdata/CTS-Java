package com.mr;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.fi.FunctionUtil;
import com.fi.Person;

public class MethodReference_8_2 {

	public static void main(String[] args) {

		// Instance Method References

		// a. Bound Receiver

		Supplier<Integer> supplier = () -> "naga".length();
		System.out.println(supplier.get());

		supplier = "naga"::length;
		System.out.println(supplier.get());

		Consumer<String> consumer = str -> System.out.println(str);
		consumer.accept("Hello");

		consumer = System.out::println;
		consumer.accept("Hi");

		List<Person> list = Person.getPersons();
		FunctionUtil.forEach(list, System.out::println);

		// 2. UnBound Receiver

		Function<Person, String> fNameFunc = (Person p) -> p.getFirstName();
		fNameFunc = Person::getFirstName;
		
		
		String greeting = "Hello";
		String name = " Laynie";
		// Uses a lambda expression
		BiFunction<String, String, String> func1 = (s1, s2) -> s1.concat(s2);
		System.out.println(func1.apply(greeting, name));
		// Uses an instance method reference on an unbound receiver
		BiFunction<String, String, String> func2 = String::concat;
		System.out.println(func2.apply(greeting, name));
		
		
		
		List<Person> personList = Person.getPersons();
		// Maps each Person object to its first name
		List<String> firstNameList = FunctionUtil.map(personList, Person::getFirstName);
		// Prints the first name list
		FunctionUtil.forEach(firstNameList, System.out::println);

	}
}
