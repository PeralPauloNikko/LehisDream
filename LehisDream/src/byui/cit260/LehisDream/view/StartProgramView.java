/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import java.util.Scanner;

/**
 *
 * @author smith
 */
public class StartProgramView {
   
    private String promptMessage;
    
    public StartProgramView() {
       //promptMessage = "Please enter your name"
       
       this.promptMessage = "\nPlease enter your name: ";
       //display the banner when view is created
       this.displayBanner();
    }
    
    public void displayBanner() {
      
       System.out.println(
               "\n**************************************************************"
              +"\n*                                                             *"
              +"\n* This is the game of Hold to the Rod                         *"
              +"\n* In this game you will follow a path to try to make it to    *"
              +"\n* the Tree of Life. The rod represents the word of God.       *"
              +"\n* If you fail to make it to the tree, you                     *"
              +"\n* will find yourself at the Great and Spacios Building.       *"
              +"\n*                                                             *"
              +"\n* Along the path, you will encounter challenges and obstacles *"
              +"\n* where you must decide what to do in situations. You will    *"
              +"\n* need to overcome them in order to advance on the path. If   *"
              +"\n* you run out of energy before you reach the tree, the game   *"
              +"\n* will end and you will end up at the great and spacious      *"
              +"\n* building.                                                   *"
              +"\n*                                                             *"
              +"\n* Good luck in arriving at the Tree of Life.                  *"
              +"\n*                                                             *"
              +"\n***************************************************************" 
       );
    }

    public void displayStartProgramView() {
        
        boolean done = false;//set flag to not done
        do{
            //prompt for and get players name
            String playersName = this.getPlayerName();
            if (playersName.toUpperCase().equals("Q"))//user wants to quit
                return;//exit the game
            
            //do the requested action and display the next view
            done = this.doAction(playersName);
            
        } while (!done);
    }        

    private String getPlayerName() {
       
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = "";// value to be returned
        boolean valid = false;// initialize to not valid
        
        while (!valid) {// loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();// get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) {// value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        return value; //return the value entered
        }
        
    private boolean doAction(String playersName) {
       System.out.println("\n*** doAction () called ***");
       return true;
    }
}
