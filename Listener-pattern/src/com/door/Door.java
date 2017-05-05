package com.door;

import java.util.ArrayList;
import java.util.List;

import com.door.listener.DoorEvent;
import com.door.listener.DoorListener;

public class Door {

	private List<DoorListener> doorListeners = null;

	public Door() {
		doorListeners = new ArrayList<>();
	}

	public void addDoorListener(DoorListener listener) {
		doorListeners.add(listener);
	}

	public void removeDoorListener(DoorListener listener) {
		doorListeners.remove(listener);
	}

	public void open() {
		System.out.println("door-open");
		DoorEvent event = new DoorEvent("2", "5");
		for (DoorListener listener : doorListeners) {
			listener.start(event);
		}
	}

	public void close() {

		System.out.println("door-close");
		DoorEvent event = new DoorEvent("2", "5");
		for (DoorListener listener : doorListeners) {
			listener.stop(event);
		}

	}

}
