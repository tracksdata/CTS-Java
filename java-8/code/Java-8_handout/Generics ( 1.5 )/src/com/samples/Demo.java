package com.samples;

class Subject{
	
}

class Java extends Subject{

}

class DotNet extends Subject{

}


class Trainer<T extends Subject> {

	T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}



public class Demo {

	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		Trainer trainer=new Trainer();
		
		Trainer<Java> javaTrainer = new Trainer<>();
		javaTrainer.setSubject(new Java());
		
		//Trainer<String> trainer=new Trainer<>();

		// ------------------------------------------

		//javaTrainer.setSubject(new DotNet());  // Type-safety
		
		// ------------------------------------------

		// Object object = javaTrainer.getSubject();
		// Java java = (Java) object;
		
		Java java=javaTrainer.getSubject();

		System.out.println("Happy End");

	}

}
