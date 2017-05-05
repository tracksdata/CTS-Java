package org.example.java8;

public class JoinerMethod {

	public static void main(String[] args) {

		String stooges = String.join(",", "Larry", "Curly", "Moe");
		System.out.println(stooges);

		String[] states = { "KA", "TN", "AP", "KL" };
		String stateList = String.join(",", states);
		System.out.println(stateList);

	}

}
