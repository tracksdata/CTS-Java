package com.ac;

import com.door.listener.DoorEvent;
import com.door.listener.DoorListener;

public class AC implements DoorListener {

	@Override
	public void start(DoorEvent event) {
		System.out.println("AC-ON in " + event.getFloorNum() + "\t" + event.getDoorNum());
	}

	@Override
	public void stop(DoorEvent event) {
		System.out.println("AC-OFF in " + event.getFloorNum() + "\t" + event.getDoorNum());
	}

}
