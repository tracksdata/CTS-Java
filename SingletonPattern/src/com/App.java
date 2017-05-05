package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.singleton.Singleton;

public class App {

	public static void main(String[] args) throws Exception {

		//Singleton singleton = Singleton.getInstance();
		Singleton singleton=Singleton.INSTANCE;

		///

		File file = new File("singleton.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(singleton);

		oos.close();

		System.out.println("singleton serialized...");

		Thread.sleep(5 * 1000);

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();
		Singleton s = (Singleton) obj;
		
		System.out.println(singleton==s);
		s.m();
		

	}

}
