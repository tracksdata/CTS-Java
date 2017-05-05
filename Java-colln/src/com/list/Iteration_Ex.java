package com.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Iteration_Ex {

	public static void main(String[] args) {

		List<String> list = new Vector<>();
		list.add("A");
		list.add("C");
		list.add("D");
		list.add("B");
		list.add("A");

		// System.out.println(list.get(3));

		// way-1

		// Enumeration<String> e = list.elements();
		// while (e.hasMoreElements()) {
		// String ele = e.nextElement();
		// System.out.println(ele);
		// }

		// way-2

		// Iterator<String> i = list.iterator();
		// while (i.hasNext()) {
		// String ele = i.next();
		// System.out.println(ele);
		// if (ele.equals("A")) {
		// i.remove();
		// }
		// }
		// System.out.println(list);

		// --------------------------------------

		// way-3

		// ListIterator<String> li=list.listIterator();
		// while(li.hasNext()){
		// System.out.println(li.next());
		// }
		// System.out.println();
		// while(li.hasPrevious()){
		// System.out.println(li.previous());
		// }

		// --------------------------------------

		// way-4 : for-each

		// for(String e:list){
		// System.out.println(e);
		// }

		// ----------------------------------------

		// int[] nums={1,2,3,4,5,6,7};
		//
		// for(int n:nums){
		// System.out.println(n);
		// }

		/*
		 * for(Type ele:_____){
		 * 
		 * 
		 * }
		 * 
		 */

		Items items = new Items();

		for (String s : items) {
			System.out.println(s);
		}

	}

}

class Items implements Iterable<String> {

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		return list.iterator();
	}

}
