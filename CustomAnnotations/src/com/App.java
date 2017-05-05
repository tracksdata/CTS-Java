package com;

import java.lang.reflect.InvocationTargetException;

import com.container.Container;

public class App {

	public static void main(String[] args) {

		Container container = new Container();
		try {
			container.process("/req1");
			container.process("/req2");
			container.process("/req1");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
