package com;

import java.util.List;

import com.model.Gender;
import com.model.Person;
import com.util.PersonUtil;

public class ClientApp {

	public static void main(String[] args) {

		List<Person> list = Person.getPersons();

		// PersonUtil.forEach(list, (p) -> {
		// System.out.println(p);
		// });
		//
		// System.out.println();
		//
		// List<Person> maleList = PersonUtil.filter(list,
		// (p) -> p.getGender() == Gender.MALE);
		// PersonUtil.forEach(maleList, (p) -> {
		// System.out.println(p);
		// });
		//
		// System.out.println();
		//
		// PersonUtil.map(maleList, (p) -> {
		// p.setDob(p.getDob().plusYears(1));
		// return p;
		// });
		//
		// PersonUtil.forEach(maleList, (p) -> {
		// System.out.println(p);
		// });

		list.stream().filter((p) -> {
			return p.getGender() == Gender.MALE;
		}).map((p) -> {
			p.setDob(p.getDob().plusYears(1));
			return p;
		}).forEach((p) -> {
			System.out.println(p);
		});

	}

}
