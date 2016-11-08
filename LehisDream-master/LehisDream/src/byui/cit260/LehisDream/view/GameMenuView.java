/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.GameControl;
import java.util.Scanner;
import lehisdream.LehisDream;

/**
 *
 * @author smith
 */
public class GameMenuView {
    private String menu;
    private String promptMessage;
    
   public GameMenuView() {
    this.menu = "\n"
              + "\n-------------------------------------------"
              + "\n| Game Menu                               |"
              + "\n-------------------------------------------"
              + "\nV - View Path"
              + "\nM - Move Forward"
              + "\nB - Visit Bishop's office"
              + "\nP - Go to Backpack"
              + "\nC - At Church"
              + "\nS - Save game"
              + "\nH - Help"
              + "\nQ - Quit"
              + "\n-------------------------------------------";
    this.promptMessage = "\nPlease enter your selection: ";
}
    /**
     * displays the start program view
     */
    public void displayGameMenuView() {
       
        boolean done = false; // set flag to not done
        do {
            System.out.println(this.menu);
            //prompt for and get menu option
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
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
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        return value; //return the value entered
        }
    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "V": // view path
                this.viewPath();
                break;
            case "M": // view path
                this.moveForward();
                break;    
            case "B": // visit Bishop's office
                this.visitBishopsOffice();
                break;
            case "P": // go to backpack
                this.goToBackpack();
                break;
            case"C": //
                this.atChurch();
                break;    
            case "S": // save the current game
                this.saveGame();
                break;
            case "H": // Go to Help
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayHelpMenu() {
        //display the game menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }
    private void saveGame() {
        SaveGameView.SaveGame();
    }
    
    private void viewPath() {
        System.out.println("*** viewPath function called ***");
    }

    private void visitBishopsOffice() {
       System.out.println("*** visitBishopsOffice function called ***");
    }

    private void goToBackpack() {
        System.out.println("*** goToBackpack function called ***");
    }
    private void moveForward() {
        System.out.println("*** moveForward function called ***");          
    }
    private void atChurch() {
        AtChurchView atChurch = new AtChurchView();
        atChurch.displayAtChurchView();
    }
    }
     

