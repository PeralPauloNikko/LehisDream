/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import java.util.Scanner;

/**
 *
 * @author EthicalH1
 */
public abstract class View implements ViewInterface{
    protected String displayMessage= "\nPlease enter your selection: "; 
    
    public View() {
}
    
public View(String message) {
    this.displayMessage = message;
}

    @Override
    public void display() {
       
        boolean done = false; // set flag to not done
        do {
            //prompt for and get menu option
            String getInput = this.getInput();
            if (getInput.toUpperCase().equals("Q")) //user wants to quit
                return; // exit the game
            
            //do the requested action and display the next view
            done = this.doAction(getInput);
            
        } while (!done);
        
        }
@Override
public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = "";// value to be returned
        boolean valid = false;// initialize to not valid
        
        while (!valid) {// loop while an invalid value is entered
           System.out.println("\n" + this.displayMessage);
            
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
}