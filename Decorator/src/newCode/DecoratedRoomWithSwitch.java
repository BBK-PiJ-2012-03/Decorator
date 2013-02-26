package newCode;

import oldCode.Room;

public class DecoratedRoomWithSwitch extends DecoratedRoom {

	private String isLO;
	public DecoratedRoomWithSwitch(Room component) {
		super(component);
		isLO = "yes";
		// TODO Auto-generated constructor stub
	}

	public String isLightOn() {
		// TODO Auto-generated method stub
		return isLO;
	}

}
