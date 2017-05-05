package com.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Ex1 {

	public static void main(String[] args) {

		// how to instantiate list-colln

		// way-1

		// ArrayList list1 = new ArrayList();
		// list1.add("string");
		// list1.add(123);

		// way-2

		// ArrayList<String> list = new ArrayList<String>();
		// list.add("string1");
		// list.add("string2");

		// way-3 ( from JDK 1.7 ) -> dimond operator ( automatic type-inference
		// )

		// ArrayList<String> list=new ArrayList<>();

		// way-4

		// List<String> list = new ArrayList<>();
		// list = new LinkedList<>();

		// way-5

		// Collection<String> collection = new ArrayList<>();
		// collection = new TreeSet<>();

	}

}
