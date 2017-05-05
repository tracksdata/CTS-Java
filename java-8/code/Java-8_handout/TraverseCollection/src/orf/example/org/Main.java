package orf.example.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("eee");

		Collections.sort(strings);
		System.out.println("Simple Sort");

		// Traverse with for:each
		// for (String str : strings) {
		// System.out.println(str);
		// }

		strings.forEach(str -> System.out.println(str));

		Comparator<String> comp = (str1, str2) -> {
			return str1.compareTo(str2);
		};

		Collections.sort(strings, comp);

		System.out.println("Sort with Comparator");

		// Traverse with iterator

		// Iterator<String> i = strings.iterator();
		// while (i.hasNext()) {
		// String string = (String) i.next();
		// System.out.println(string);
		// }

		strings.forEach(str -> System.out.println(str));

	}

}
