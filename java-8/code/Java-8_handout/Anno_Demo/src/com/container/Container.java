package com.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Process  components

public class Container {

	public void processURL(String url) {

		// Manage to process any request.

		try {
			Class clazz = Class.forName("com.comp.Component");
			Object obj = clazz.newInstance();

			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				RequestMapping anno = method
						.getAnnotation(RequestMapping.class);
				if (anno != null) {
					String annoUrl = anno.url();
					
					System.out.println(url);
					System.out.println();
					
					if (url.equals(annoUrl)) {
						method.invoke(obj, null);
					}
				}
			}
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
