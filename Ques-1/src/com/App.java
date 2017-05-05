package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cognizant {
	final List<String> list = Collections.unmodifiableList(new ArrayList<>());
}

public class App {

	public static void main(String[] args) {

		Cognizant cog = new Cognizant();
		cog.list.add("Abc");
		cog.list.add("Abc");
		cog.list.add("Abc");
		cog.list.add("Abc");

	}

}
