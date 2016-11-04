/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.control;

/**
 *
 * @author smith
 */
public class MapControl {

    public static double calcVolumeOfFont(double height, double width, double length) {
        
        if (height < 3 || height > 6) { //height has limits, 3 and 6
                return -1;
        }
        
        if (width < 5 || width > 10) { //width has limits, 5 and 10
                return -2;
        }        
        
        if (length < 4 || length > 8) { //length has limits, 4 and 8
                return -3;
        }
        
        double volume = (height * width * length);
        
        return volume;
    
    }
    public double calcSquareFeetOfHome(double length, double width) {
        
        if (length < 0) {//length is negative? 
        return -1;
        }
        
        if (width < 0) { //width is negative?
        return -1;
        }
        
        //calculates squarefeet by multiplying length and width
        double squarefeet = (length * width);
        
        //returns squarefeet
        return squarefeet;

    }
}
