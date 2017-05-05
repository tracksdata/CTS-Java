package com.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.component.Component;
import com.container.annotation.RequestMapping;
import com.container.annotation.RequestMethod;

public class Container {

	public void process(String url) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Class clazz = Class.forName("com.component.Component");
		Method[] methods = clazz.getMethods();

		Object instance = clazz.newInstance();

		for (Method method : methods) {

			RequestMapping anno = method.getAnnotation(RequestMapping.class);
			if (anno != null) {
				String path = anno.url();
				//RequestMethod httpVerb = anno.method();

				if (url.equals(path)) {
					method.invoke(instance, new Object[] {});
				}

			}

		}

	}

}
