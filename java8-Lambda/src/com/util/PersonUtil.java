package com.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// Person API design

public class PersonUtil {

	// display
	public static <T> void forEach(List<T> list, Consumer<T> action) {
		for (T item : list) {
			action.accept(item);
		}
	}

	// filter

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {

		List<T> filteredList = new ArrayList<>();
		for (T item : list) {
			if (predicate.test(item)) {
				filteredList.add(item);
			}
		}
		return filteredList;
	}

	// map
	public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
		List<R> mappedList = new ArrayList<>();
		for (T item : list) {
			mappedList.add(mapper.apply(item));
		}
		return mappedList;
	}

}
