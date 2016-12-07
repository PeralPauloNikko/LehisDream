/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import lehisdream.LehisDream;

/**
 *
 * @author EthicalH1
 */
public abstract class View implements ViewInterface{
    protected String displayMessage= "\nPlease enter your selection: "; 
    
    protected final BufferedReader keyboard = LehisDream.getInFile();
    protected static PrintWriter console = LehisDream.getOutFile();
    
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
        
        
        String value = "";// value to be returned
        boolean valid = false;// initialize to not valid
        try {
        while (!valid) {// loop while an invalid value is entered
           this.console.println("\n" + this.displayMessage);
            
            value = this.keyboard.readLine();// get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) {// value is blank
                ErrorView.display(this.getClass().getName(),
                                  "\nInvalid value: value can not be blank");
                continue;
            }
            break; // end the loop
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                              "Error reading input: " + e.getMessage());
        }
        return value; //return the value entered6
}
//This needed to be a static function, cannot use the normal input methods, this does not extend View class, okd by Brother Jones at 8:55 pm 12/6/2016

public static double getnextDouble(){
    Scanner keyboard = new Scanner(System.in);//get infile for keyboard
    
//    while (true) {
        try {
        double value = keyboard.nextDouble();
        
        return value;
        
        } catch (InputMismatchException e) {
        ErrorView.display("View", "You must enter a valid decimal value. Please try "
                + "again.\n");
        }
        
        double value = 0;
        return value;
    }

}




       

//}