package BoardClass;

import java.util.Scanner;
import Rooms.Room;

public class LinkenshireEstate {
    private Room[][] Estate;
    private int width;
    public LinkenshireEstate(Room[][] Estate){
        this.Estate= Estate;
    }
    public LinkenshireEstate(int width){
        this.width = width;
        Estate = new Room[width][width];
    }
    public void printEstate(){
        for(Room[] i : Estate){
            for(Room j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
