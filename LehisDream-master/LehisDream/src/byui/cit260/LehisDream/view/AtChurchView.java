/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.MapControl;
import byui.cit260.LehisDream.exceptions.MapControlException;
import java.io.PrintWriter;
import lehisdream.LehisDream;

/**
 *
 * @author smith
 */
public class AtChurchView {
    
    protected final PrintWriter console = LehisDream.getOutFile();
    
    public AtChurchView(){
        
    }
    public void displayAtChurchView() {

       
        double fontlength;// value to be returned
        double fontwidth;
        double fontheight;
        boolean valid = false;// initialize to not valid
        

        while (!valid) {// loop while an invalid value is entered

            this.console.println("Enter the height(depth) of the font (Enter -1 to cancel)");

            fontheight = View.getnextDouble();// get next line typed on keyboard
            if (fontheight == -1) {
                 this.console.println("You chose to cancel");
                return;
            }
            this.console.println("Enter the width of the font (Enter -1 to cancel)");
            fontwidth = View.getnextDouble();// get next line typed on keyboard
            if (fontwidth == -1) {
                 this.console.println("You chose to cancel");
                return;
            }
            this.console.println("Enter the length of the font (Enter -1 to cancel)");

            fontlength = View.getnextDouble();// get next line typed on keyboard
            if (fontlength == -1) {
                 this.console.println("You chose to cancel");
                return;
            }
            try {
            double volume = MapControl.calcVolumeOfFont(fontheight, fontwidth, fontlength);
             this.console.println("\nThe volume of the font is " + volume + " feet.");
            valid = true;
            } catch (MapControlException me){
                ErrorView.display(this.getClass().getName(),me.getMessage());
                
            }
//            
    }
    }
}

