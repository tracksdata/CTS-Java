package com.samples;

import java.util.function.Function;

class Abcd implements Function<String, Integer> {

	@Override
	public Integer apply(String arg0) {
		// TODO Auto-generated method stub
		return new Integer(arg0);
	}
}

public class ReadymadeFI {

	public static void main(String[] args) {

		Function<String, Integer> f = (String s) -> {
			Integer i = new Integer(s);
			return i;
		};


	}

}
