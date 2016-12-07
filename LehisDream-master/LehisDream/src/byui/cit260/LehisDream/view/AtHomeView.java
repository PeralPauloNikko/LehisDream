/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.HouseControl;
import byui.cit260.LehisDream.exceptions.HouseControlException;
import java.io.PrintWriter;
import lehisdream.LehisDream;



/**
 *
 * @author EthicalH1
 */
public class AtHomeView {
    protected final PrintWriter console = LehisDream.getOutFile();

    
    
    public AtHomeView() {
    }

    public void displayAtHomeView() {

//       
        double homelength;// value to be returned
        double homewidth;
        boolean valid = false;// initialize to not valid

        while (!valid) {// loop while an invalid value is entered

            this.console.println("\nEnter the width of the home (Enter -1 to cancel)");
            homewidth = View.getnextDouble();// get next line typed on keyboard
            if (homewidth == -1) {
                this.console.println("You chose to cancel");
                return;
            }
            this.console.println("\nEnter the length of the home (Enter -1 to cancel)");

            homelength = View.getnextDouble();// get next line typed on keyboard
            if (homelength == -1) {
                this.console.println("You chose to cancel");
                return;
            }
            try {
            double squarefeet = HouseControl.calcSquareFeetOfHome(homelength, homewidth);
            this.console.println("\nThe squarefeet of the home is " + squarefeet + " feet.");
            valid = true;
            } catch (HouseControlException me) {
                ErrorView.display(this.getClass().getName(),me.getMessage());
                
            }
        
           
                
            }
            // end the loop
        }
        
}

            
