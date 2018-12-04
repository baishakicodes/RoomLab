package Rooms;

import People.Person;

public class Room {
	Person occupant;
	int xLoc,yLoc;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}

	/**
	 * Method controls the results when a person enters this room.
	 * @param x the Person entering
	 */
	public void enterRoom(Person x)
	{
		System.out.println("You're inside the Linkenshire estate of your best friend Wendy. She is now dead. Rumor has it that she was murdered. You're here to figure"+"\n"+
				"out who killed her."+"\n"+"To your north there is a staircase that leads you upstairs."+"\n"+"To your South is the front door that leads you out of the Mansion and into the gradens."+"\n"+
				"To your east is the dining room and to your west is the bathroom.");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}

	/**
	 * Removes the player from the room.
	 * @param x
	 */
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
