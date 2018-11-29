package Rooms;

import People.Person;
import Game.Runner;

public class procrastinationRoom extends Room {

    public procrastinationRoom(int x, int y){
        super(x, y);
    }

    @Override
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Great, you found the procrastination room. Go on, procrastinate. In this room no one will judge you.");
        Runner.gameOff();

    }
}
