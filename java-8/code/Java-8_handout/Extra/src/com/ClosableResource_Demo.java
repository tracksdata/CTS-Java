package com;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;

class Resouce implements Closeable {

	public Resouce() {
		System.out.println("init with exteral world..");
	}

	public void m() {
		System.out.println("....");
	}

	@Override
	public void close() throws IOException {
		System.out.println("reset.....");
	}

}


class Resouce2 implements Closeable {

	public Resouce2() {
		System.out.println("init with exteral world..");
	}

	public void m() {
		System.out.println("....");
	}

	@Override
	public void close() throws IOException {
		System.out.println("reset.....");
	}

}

public class ClosableResource_Demo {

	public static void main(String[] args) {

		try (Resouce r = new Resouce();Resouce r2 = new Resouce();) {
			new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis=new FileInputStream("")){
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		//--------------------------------------------------------------------------------
		
		
		
	}

}
