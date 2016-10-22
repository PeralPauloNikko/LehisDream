/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.control;

import static javax.swing.Spring.width;
import static jdk.internal.org.objectweb.asm.commons.GeneratorAdapter.OR;
import sun.security.util.Length;

/**
 *
 * @author EthicalH1
 */
public class MapControl {
    public double calcVolumeOfFont (double height, double width, double length) {
    
       if (height <3 || height > 6) {
               return -1; 
       }
       if (width <5 || width > 10) {
               return -1; 
    }
       if (length <4 || length > 8) {
     return -1;
       }
       double volume = (height*width*length);
               return volume;
    }
    
}

