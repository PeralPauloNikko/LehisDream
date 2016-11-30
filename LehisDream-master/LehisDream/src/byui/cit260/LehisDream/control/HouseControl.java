/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.control;

import byui.cit260.LehisDream.exceptions.HouseControlException;

/**
 *
 * @author EthicalH1
 */
public class HouseControl {
       public static double calcSquareFeetOfHome(double length, double width)throws HouseControlException {
        
        if (length < 0) {//length is negative? 
        throw new HouseControlException("\nLength must be greater than 0."
                        + "Please enter in another value for the length.");
        }
        
        if (width < 0) { //width is negative?
        throw new HouseControlException("\nWidth must be greater than 0."
                        + "Please enter in another value for the width.");
        }
        
        //calculates squarefeet by multiplying length and width
        double squarefeet = (length * width);
        
        //returns squarefeet
        return squarefeet;

    } 
}
