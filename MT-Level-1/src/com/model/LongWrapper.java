package com.model;

public class LongWrapper {

	private Object key = new Object(); // monitor

	private long l;

	public LongWrapper(long l) {
		this.l = l;
	}

	public long getValue() {
		synchronized (key) {
			return l;
		}
	}

	public void incrementValue() {
		synchronized (key) {
			l = l + 1; // read --> increment --> write
		}
	}
}
