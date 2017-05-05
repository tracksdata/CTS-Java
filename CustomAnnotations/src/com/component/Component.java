package com.component;

import com.container.annotation.RequestMapping;
import com.container.annotation.RequestMethod;

public class Component {

	@RequestMapping(url = "/req1", method = RequestMethod.GET)
	public void m1() {
		System.out.println("/req1 ....m1()");
	}

	@RequestMapping(url = "/req2", method = RequestMethod.POST)
	public void m2() {
		System.out.println("/req2 ....m2()");
	}

}
