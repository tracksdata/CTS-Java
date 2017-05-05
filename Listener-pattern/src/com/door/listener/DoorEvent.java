package com.door.listener;

public class DoorEvent {

	private String floorNum;
	private String doorNum;

	public String getFloorNum() {
		return floorNum;
	}

	public String getDoorNum() {
		return doorNum;
	}

	public DoorEvent(String floorNum, String doorNum) {
		super();
		this.floorNum = floorNum;
		this.doorNum = doorNum;
	}

}
