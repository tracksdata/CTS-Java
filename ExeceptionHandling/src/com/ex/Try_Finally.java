package com.ex;

import java.io.Closeable;
import java.io.FileInputStream;

class Resource implements Closeable {

	public void init() {
		System.out.println("init....");
	}

	public void use() {
		System.out.println("Using that resource....");
		throw new RuntimeException("ooops");
	}

	public void close() {
		System.out.println("close....");
	}

}

public class Try_Finally {

	public static void main(String[] args) {

		Resource resource = new Resource();
		resource.init();
		try {
			resource.use();
			// resource.close();
			return;
		} catch (RuntimeException re) {
			System.out.println("ex- " + re.getMessage());
			// resource.close();
			// return;
		}
		// finally {
		// resource.close();
		// }
		// resource.close();

		// System.out.println("happy end");
		
		//----------------------------------------
		
		
		// JDK 1.7
		
		try(Resource r1=new Resource();FileInputStream fis=new FileInputStream("somefile")){
			
		}catch (Exception e) {
			System.out.println("Ex-"+e.getMessage());
		}
		
		//----------------------------------------
		
		try{
			
		}finally{
			
		}
		
		//----------------------------------------
		
		

	}

}
