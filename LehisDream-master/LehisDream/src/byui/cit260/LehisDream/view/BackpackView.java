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
public class BackpackView extends View {

public BackpackView() {
          super("\n"
              + "\n-------------------------------------------"
              + "\n| Main Menu                               |"
              + "\n-------------------------------------------"
              + "\nS - Sword(can only be used once)-----------"
              + "\nF - Flashlight-----------------------------"
              + "\nD - Water(1)-------------------------------"
              + "\nE - Snack(1)-------------------------------"
              + "\nW - Wallet---------------------------------"
              + "\nQ - Quit-----------------------------------"
              + "\n-------------------------------------------");
}
    //display item view
public void displayInput() {
    boolean done = false;//set flag to not done
    do {
        //prompt for and get menu option
            //prompt for and get menu option
            String getInput = this.getInput();
            if (getInput.toUpperCase().equals("Q")) //user wants to quit
                return; // exit the game
            
            //do the requested action and display the next view
            done = this.doAction(getInput);
            
        } while (!done);
        
    }

    /**
     *
     * @return
     */
    public String getInput() {
 
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = "";// value to be returned
        boolean valid = false;// initialize to not valid
        
        while (!valid) {// loop while an invalid value is entered
           System.out.println("\n" + this.displayMessage);
            
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
    @Override
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
        SwordView sword = new SwordView();
        sword.display();        
        return true;
    }

    private boolean flashlight() {
        System.out.println("\n*** flashlight() function called ***");
        return true;
    }

    private boolean water(int i) {
        System.out.println("\n*** water() function called ***");
        return true;
    }

    private boolean snack(int i) {
        System.out.println("\n*** snack() function called ***");
        return true;
    }

    private boolean wallet(int i) {
        System.out.println("\n*** wallet() function called ***");
        return true;
    }
}
    
   


