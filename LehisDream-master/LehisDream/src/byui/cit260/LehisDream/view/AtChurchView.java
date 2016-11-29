/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.MapControl;
import byui.cit260.LehisDream.exceptions.MapControlException;
import java.util.Scanner;

/**
 *
 * @author smith
 */
public class AtChurchView {
    
    public AtChurchView(){
        
    }
    public void displayAtChurchView() {

        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        double fontlength;// value to be returned
        double fontwidth;
        double fontheight;
        boolean valid = false;// initialize to not valid

        while (!valid) {// loop while an invalid value is entered

            System.out.println("Enter the height(depth) of the font (Enter -1 to cancel)");

            fontheight = View.getnextDouble();// get next line typed on keyboard
            if (fontheight == -1) {
                System.out.println("You chose to cancel");
                return;
            }
            System.out.println("Enter the width of the font (Enter -1 to cancel)");
            fontwidth = View.getnextDouble();// get next line typed on keyboard
            if (fontwidth == -1) {
                System.out.println("You chose to cancel");
                return;
            }
            System.out.println("Enter the length of the font (Enter -1 to cancel)");

            fontlength = View.getnextDouble();// get next line typed on keyboard
            if (fontlength == -1) {
                System.out.println("You chose to cancel");
                return;
            }
            try {
            double volume = MapControl.calcVolumeOfFont(fontheight, fontwidth, fontlength);
            System.out.println("\nThe volume of the font is " + volume + " feet.");
            valid = true;
            } catch (MapControlException me){
                System.out.println(me.getMessage());
                
            }
//            double volume = 0;
//            if (volume == -1) {
//                System.out.println("You entered an invalid height. It should between 3 and 6.");
//            } else if (volume == -2) {
//                System.out.println("You entered an invalid width. It should be between 5 and 10.");
//            } else if (volume == -3) {
//                System.out.println("You entered an invalid length. It should be bewteen 4 and 8.");
//            } else {
//                valid = true;
                
            }
            // end the loop
        }
//        return; //return 
    }

