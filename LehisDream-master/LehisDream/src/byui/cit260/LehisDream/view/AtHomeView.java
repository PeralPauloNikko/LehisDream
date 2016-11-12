/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.MapControl;
import java.util.Scanner;

/**
 *
 * @author EthicalH1
 */
public class AtHomeView {

    public AtHomeView() {
    }

    public void displayAtHomeView() {

        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        double homelength = 0.0;// value to be returned
        double homewidth = 0.0;
        boolean valid = false;// initialize to not valid

        while (!valid) {// loop while an invalid value is entered

            System.out.println("Enter the width of the home (Enter -1 to cancel)");
            homewidth = keyboard.nextDouble();// get next line typed on keyboard
            if (homewidth == -1) {
                System.out.println("You chose to cancel");
                return;
            }
            System.out.println("Enter the length of the home (Enter -1 to cancel)");

            homelength = keyboard.nextDouble();// get next line typed on keyboard
            if (homelength == -1) {
                System.out.println("You chose to cancel");
                return;
            }

            double squarefeet = MapControl.calcSquareFeetOfHome(homelength, homewidth);

            if (squarefeet == -1) {
                System.out.println("You entered an invalid length. It should be greater than 0.");
            } else if (squarefeet == -2) {
                System.out.println("You entered an invalid width. It should be greater than 0.");
            } else {
                valid = true;
                System.out.println("The squarefeet of the home is:" + squarefeet);
            }
            // end the loop
        }
        return; //return 
    }
}
