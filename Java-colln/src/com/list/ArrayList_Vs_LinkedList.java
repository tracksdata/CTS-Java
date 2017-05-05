package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListCompare {

	public void compare(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			list.add("string-" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}

public class ArrayList_Vs_LinkedList {

	public static void main(String[] args) {

		ListCompare listCompare = new ListCompare();
		listCompare.compare(new ArrayList<>(100));
		listCompare.compare(new LinkedList<>());

	}

}
