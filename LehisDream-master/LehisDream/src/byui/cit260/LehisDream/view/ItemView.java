/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;
import byui.cit260.LehisDream.control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author EthicalH1
 */
public class ItemView {
    private String menu;
    private final String promptMessage;
    
public ItemView() {
    this.menu = "\n"
              + "\n-------------------------------------------"
              + "\n| Main Menu                               |"
              + "\n-------------------------------------------"
              + "\nS - Sword----------------------------------"
              + "\nF - Flashlight-----------------------------"
              + "\nD - Water----------------------------------"
              + "\nE - Snack----------------------------------"
              + "\nW - Wallet---------------------------------"
              + "\nX - Quit-----------------------------------"
              + "\n-------------------------------------------";
    this.promptMessage = "\nPlease enter your choice: ";
}
    //display item view
public void displayItemView() {
    boolean done = false;//set flag to not done
    do {
        //prompt for and get menu option
                    System.out.println(this.menu);
            //prompt for and get menu option
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) //user wants to quit
                return; // exit the game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    private String getMenuOption() {
 
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = "";// value to be returned
        boolean valid = false;// initialize to not valid
        
        while (!valid) {// loop while an invalid value is entered
           System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();// get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) {// value is blank
                System.out.println("\nInvalid value: you cannot leave this blank");
                continue;
            }
            
            break; // end the loop
        }
        return value; //return the value entered
    }
    public boolean doAction(String choice) {
       choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "S": // create and start a new game
                this.sword(1);
                break;
            case "F": // restart an existing game
                this.flashlight();
                break;
            case "D": // display the help menu
                this.water(1);
                break;
            case "E": // save the current game
                this.snack(1);
            case "W": // save the current game
                this.wallet(500);
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private boolean sword(int i) {
        System.out.println("\n*** doAction() function called ***");
        return true;
    }

    private boolean flashlight() {
        System.out.println("\n*** doAction() function called ***");
        return true;
    }

    private boolean water(int i) {
        System.out.println("\n*** doAction() function called ***");
        return true;
    }

    private boolean snack(int i) {
        System.out.println("\n*** doAction() function called ***");
        return true;
    }

    private boolean wallet(int i) {
        System.out.println("\n*** doAction() function called ***");
        return true;
    }
}
    
   


