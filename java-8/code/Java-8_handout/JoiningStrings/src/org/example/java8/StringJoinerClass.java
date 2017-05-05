package org.example.java8;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {

	public static void main(String[] args) {

		// creating a StringJoiner
		StringJoiner sj = new StringJoiner(",", "{", "}");
		sj.setEmptyValue("No stooges Yet");
		System.out.println(sj);

		sj.add("Mow").add("Larry").add("Curly");

		System.out.println(sj);

		// Merging StringJoiner instances
		StringJoiner sj2 = new StringJoiner(",");
		sj2.add("Shemp");

		sj.merge(sj2);

		System.out.println(sj);

		// Working with Collections

		Set<String> set = new TreeSet<>();
		set.add("KA");
		set.add("AP");

		StringJoiner sj3 = new StringJoiner(" and ");
		set.forEach(s -> sj3.add(s));

		System.out.println(sj3);

	}

}
