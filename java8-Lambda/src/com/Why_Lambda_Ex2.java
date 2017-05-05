package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.print.attribute.standard.MediaSize.Other;

public class Why_Lambda_Ex2 {

	public static void main(String[] args) {

		Integer[] arr = { 1,3,5,4 };
		List<Integer> list = Arrays.asList(arr);

		//		int sum = 0, count = 0;
		//		for (Integer i : list) {
		//
		//			if (i % 2 == 0) {
		//				sum = sum + i;
		//				count++;
		//				if (count == 2) {
		//					break;
		//				}
		//			}
		//		}
		//		System.out.println(sum);
		
		 Optional<Integer> optional=list
									//.stream()
				 					.parallelStream()
									.filter((n)->n%2==0)
									.map(n->n*n)
									.limit(2)
									.reduce(Integer::sum);
									
		System.out.println(optional.get());

	}

}
