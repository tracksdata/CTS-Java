package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SynchronizedRGB {
	
	// Values must be between 0 and 255.
	private int red;
	private int green;
	private int blue;
	private String name;

	private void check(int red, int green, int blue) {
		if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
			throw new IllegalArgumentException();
		}
	}

	public SynchronizedRGB(int red, int green, int blue, String name) {
		check(red, green, blue);
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.name = name;
	}

	public void set(int red, int green, int blue, String name) {
		check(red, green, blue);
		synchronized (this) {
			this.red = red;
			this.green = green;
			this.blue = blue;
			this.name = name;
		}
	}

	public synchronized int getRGB() {
		return ((red << 16) | (green << 8) | blue);
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void invert() {
		red = 255 - red;
		green = 255 - green;
		blue = 255 - blue;
		name = "Inverse of " + name;
	}
}

public class Thread_Immutable_Ex {

	public static void main(String[] args) {

		SynchronizedRGB color = new SynchronizedRGB(0, 0, 0, "Pitch Black");

		int myColorInt = color.getRGB(); // Statement 1
		String myColorName = color.getName(); // Statement 2

		//		 synchronized (color) {
		//			 int myColorInt = color.getRGB();
		//			 String myColorName = color.getName();
		//		 }

	}

}



/*
 * 
 * A Strategy for Defining Immutable Objects
 * 
 * 
 *  --> Don't provide "setter" methods — methods that modify fields or objects referred to by fields.
 *  --> Make all fields final and private.
 *  --> Don't allow subclasses to override methods.
 *  --> If the instance fields include references to mutable objects, don't allow those objects to be changed:
 *   
 * 
 */



final class ImmutableRGB {

    // Values must be between 0 and 255.
    final private int red;
    final private int green;
    final private int blue;
    final private String name;
    final private List<String> list;

    private void check(int red,
                       int green,
                       int blue) {
        if (red < 0 || red > 255
            || green < 0 || green > 255
            || blue < 0 || blue > 255) {
            throw new IllegalArgumentException();
        }
    }

    public ImmutableRGB(int red,
                        int green,
                        int blue,
                        String name) {
        check(red, green, blue);
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = name;
        
        
        List<String> list=new ArrayList<>();
        list.add("red");
        list.add("blue");
        
        this.list=Collections.unmodifiableList(list);
        
    }


    public int getRGB() {
        return ((red << 16) | (green << 8) | blue);
    }

    public String getName() {
        return name;
    }

    public ImmutableRGB invert() {
        return new ImmutableRGB(255 - red,
                       255 - green,
                       255 - blue,
                       "Inverse of " + name);
    }
}




