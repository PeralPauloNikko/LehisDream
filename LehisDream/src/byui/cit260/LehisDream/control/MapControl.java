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

    public double calcVolumeOfFont(double height, double width, double length) {
        
        if (height < 3 || height > 6) { //height has limits, 3 and 6
                return -1;
        }
        
        if (width < 5 || width > 10) { //width has limits, 5 and 10
                return -1;
        }        
        
        if (length < 4 || length > 8) { //length has limits, 4 and 8
                return -1;
        }
        
        double volume = (height * width * length);
        
        return volume;
    
    }
}
