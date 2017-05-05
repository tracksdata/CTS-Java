package com.light;

import com.door.listener.DoorEvent;
import com.door.listener.DoorListener;

public class Light implements DoorListener {

	@Override
	public void start(DoorEvent event) {
		System.out.println("Light-ON in "+event.getFloorNum()+"\t"+event.getDoorNum());
	}
	@Override
	public void stop(DoorEvent event) {
		System.out.println("Light-OFF in "+event.getFloorNum()+"\t"+event.getDoorNum());
	}
	
	
}
