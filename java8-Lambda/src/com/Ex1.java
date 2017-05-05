package com;

@FunctionalInterface
interface StringToIntMapper {
	int map(String str);

	default void def() {
	}

	static void sta() {
	}

	boolean equals(Object obj);
}


class StringUtil{
	public int length(StringToIntMapper mapper,String string){
		return mapper.map(string);
	}
}

public class Ex1 {

	public static void main(String[] args) {
		
		StringUtil util=new StringUtil();
		
//		util.length(new StringToIntMapper() {
//			@Override
//			public int map(String str) {
//				return str.length();
//			}
//		}, "Naga");
//		
		util.length(str->{return str.length();}, "Naga");

	}

}

