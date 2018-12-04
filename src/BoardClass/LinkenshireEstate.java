package BoardClass;

import java.util.Scanner;


public class LinkenshireEstate {
    private String[][] Estate;
    public LinkenshireEstate(String[][] Estate){
        this.Estate=Estate;
    }
    public void arrayConfig(int numRows, int numCols){
        Scanner arrayConfig = new Scanner(System.in);
        System.out.println("How big would you like the estate to be? Choose 4(for 4 by 4) or 5(for 5 by 5).");
        int config = arrayConfig.nextInt();
        if(config==4){
            Estate = new String[4][4];
        }
        if(config==5){
            Estate = new String[5][5];
        }
        else{
            System.out.println("That's not a valid input. Choose either 4 or 5!");
        }
    }
}
