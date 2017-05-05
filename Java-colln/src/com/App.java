package com;

import com.ds.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("biryani");
		list.add("meals");
		list.add("juice");
		
		list.remove(1);
		
		list.display();
		
	}

}
