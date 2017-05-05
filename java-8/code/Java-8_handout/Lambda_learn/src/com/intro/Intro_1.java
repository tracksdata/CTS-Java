package com.intro;

@FunctionalInterface
interface StringToIntMapper {
	int map(String str);
}

public class Intro_1 {

	public static void main(String[] args) {

		StringToIntMapper mapper = (String str) -> {return str.length();};

		String name = "naga";
		int mappedValue = mapper.map(name);
		System.out.println("name=" + name + ",mapped value=" + mappedValue);

		// ----------------------------------------------------------------

		mapper = new StringToIntMapper() {
			@Override
			public int map(String str) {
				return str.length();
			}
		};

		mappedValue = mapper.map(name);
		System.out.println("name=" + name + ",mapped value=" + mappedValue);
		
		//----------------------------------------------------------------------

	}

}
