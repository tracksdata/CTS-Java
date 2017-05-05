package com.comp;

import com.container.RequestMapping;

public class Component {

	// URL: /login
	@RequestMapping(url = "/login")
	public void doLogin() {
		System.out.println("do login.....");
	}

	// URL: /register
	@RequestMapping(url = "/register")
	@RequestMapping(url = "/subscribe")
	public void doRegister() {
		System.out.println("do Register.....");
	}

	public void abc() {
		System.out.println("do login.....");
	}

}
