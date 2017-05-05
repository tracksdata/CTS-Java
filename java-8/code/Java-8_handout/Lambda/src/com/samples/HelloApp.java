package com.samples;

public class HelloApp {

	public static void main(String[] args) {

		Greet greetObj = new Greet();

		greetObj.greet(new Hello() {
			@Override
			public void sayHello(String name) {
				System.out.println(name + " Hello Welcome to Lambda");
			}
		});

		greetObj.greet((name) -> {
			System.out.println(name + " Hello Welcome to Lambda");
		});

	}

}

// ---------------------------------------------------------------------

interface Hello {
	void sayHello(String name);
}

class Greet {

	public void greet(Hello hello) {
		hello.sayHello("Naga");
	}

}

// --------------------------------------------------------------------------