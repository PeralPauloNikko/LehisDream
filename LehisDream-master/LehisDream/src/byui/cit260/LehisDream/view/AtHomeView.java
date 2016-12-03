/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.HouseControl;
import byui.cit260.LehisDream.exceptions.HouseControlException;



/**
 *
 * @author EthicalH1
 */
public class AtHomeView {

    public AtHomeView() {
    }

    public void displayAtHomeView() {

//        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        double homelength;// value to be returned
        double homewidth;
        boolean valid = false;// initialize to not valid

        while (!valid) {// loop while an invalid value is entered

            System.out.println("\nEnter the width of the home (Enter -1 to cancel)");
            homewidth = View.getnextDouble();// get next line typed on keyboard
            if (homewidth == -1) {
                System.out.println("You chose to cancel");
                return;
            }
            System.out.println("\nEnter the length of the home (Enter -1 to cancel)");

            homelength = View.getnextDouble();// get next line typed on keyboard
            if (homelength == -1) {
                System.out.println("You chose to cancel");
                return;
            }
            try {
            double squarefeet = HouseControl.calcSquareFeetOfHome(homelength, homewidth);
            System.out.println("\nThe squarefeet of the home is " + squarefeet + " feet.");
            valid = true;
            } catch (HouseControlException me) {
                System.out.println(me.getMessage());
                
            }
        
            
//            int squarefeet = 0;
//            if (squarefeet == -1) {
//                System.out.println("You entered an invalid length. It should be greater than 0.");
//            } else if (squarefeet == -2) {
//                System.out.println("You entered an invalid width. It should be greater than 0.");
//            } else {
//                valid = true;
                
            }
            // end the loop
        }
        
}

            