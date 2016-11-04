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
public class HelpMenuView {
    private String menu;
    private String promptMessage;
    
    public HelpMenuView() {
    this.menu = "\n"
              + "\n-------------------------------------------"
              + "\n| Help Menu                               |"
              + "\n-------------------------------------------"
              + "\nO - What is the object of the game"
              + "\nM - How to move"
              + "\nE - Entering into zones/scenes"
              + "\nX - Exit"
              + "\n-------------------------------------------";
    this.promptMessage = "\nPlease enter your selection: ";
}
     /**
     * displays the help menu view
     */
    public void displayHelpMenuView() {
       
        boolean done = false; // set flag to not done
        do {
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
            case "O": // learn more about object of game
                this.displayObject(); 
                break;// learn more about object of game
            case "M": // more info about moving character
                this.displayMoves(); 
                break;
            case "E": // entering the zones/scenes
                this.displayScenes();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayObject() {
             System.out.println   ("\n --Object of the Game--"
                                  +"\n-----------------------------------------------------------------------------------------------------------------------------"
                                  +"\n The object of the game is to move along the path by answering the questions in the situations and not lose a lot of energy. "
                                  +"\n You will need to have enough energy to make it to the Tree of Life. There will be opportunities along the way where you can "
                                  +"\n accumulate more energy. If you run out of energy before you reach the Tree of Life, you will end up at the great and        "
                                  +"\n spacious building."
                                  +"\n-----------------------------------------------------------------------------------------------------------------------------");
    }
    private void displayMoves() {
            System.out.println    ("\n --How to Move-- "
                                  +"\n----------------------------------------------------------------------------------------------------------------------------"
                                  +"\n You will move your person consecutively along the spaces on the map. IN each of the 5 zones, there will be 5 spaces. You   "
                                  +"\n will choose a plus (+) to go forward one space if that is what the choice is at that time in the game.                     "
                                  +"\n----------------------------------------------------------------------------------------------------------------------------");
    }
    private void displayScenes() {
        System.out.println("\n --Entetring the Scenes/Zones--"
                                  +"\n-----------------------------------------------------------------------------------------------------------------------------"
                                  +"\n During the course of the game, there are five zones that consisit of 5 spaces in each zone. The five zones are At Home, At  "
                                  +"\n School, At the Store, At the Movei Theatre, and At Church. In each zone, there are 5 situations where a question will be    "
                                  +"\n asked and then need an answer. Based on the answer given, energy will be lost. There are areas on the map where energy can  "
                                  +"\n be increased. There is also the possibility of visiting the Bishop's office or yusing the items in the backpack for the     "
                                  +"\n addition of energy."
                                  +"\n-----------------------------------------------------------------------------------------------------------------------------");
    }
}
