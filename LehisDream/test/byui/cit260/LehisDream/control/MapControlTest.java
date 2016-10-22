/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EthicalH1
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcVolumeOfFont method, of class MapControl.
     */
    @Test
    public void testCalcVolumeOfFont() {
        System.out.println("calcVolumeOfFont");
        /*******************************************/
        System.out.println("\tTest Case#1");
                
                //input of test scores 1
        double height = 5.0;
        double width = 7.0;
        double length = 6.0;
        
        MapControl instance = new MapControl();
        
        double expResult = 210.0;
        
        double result = instance.calcVolumeOfFont(height, width, length);
        
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.


        
        
        //Test Case 2
        System.out.println("\tTest case#2");
        height = 2.0;
        width = 5.0;
        length = 4.0;
        expResult = -1.0;
        
        result = instance.calcVolumeOfFont(height, width, length);
        
        assertEquals(expResult, result, 0.0);
        // TODO test case 2
        
        //Test Case 3
         System.out.println("\tTest case#3");
        height = 7.0;
        width = 5.0;
        length = 4.0;
        expResult = -1.0;
        
        result = instance.calcVolumeOfFont(height, width, length);
        
        assertEquals(expResult, result, 0.0);
        // TODO test case 3
        
         System.out.println("\tTest case#4");
        height = 5.0;
        width = 4.0;
        length = 5.0;
        expResult = -1.0;
        
        result = instance.calcVolumeOfFont(height, width, length);
        
        assertEquals(expResult, result, 0.0);
        // TODO test case 4
        
         System.out.println("\tTest case#5");
        height = 5.0;
        width = 11.0;
        length = 5.0;
        expResult = -1.0;
        
        result = instance.calcVolumeOfFont(height, width, length);
        
        assertEquals(expResult, result, 0.0);
        // TODO test case 5
        
        
        
        //Test Case 6
         System.out.println("\tTest case#6");
        height = 5.0;
        width = 9.0;
        length = 3.0;
        expResult = -1.0;
        
        result = instance.calcVolumeOfFont(height, width, length);
        
        assertEquals(expResult, result, 0.0);
        // TODO test case 6

        
        //Test Case 7
         System.out.println("\tTest case#7");
        height = 5.0;
        width = 9.0;
        length = 9.0;
        expResult = -1.0;
        
        result = instance.calcVolumeOfFont(height, width, length);
        
        assertEquals(expResult, result, 0.0);
        // TODO test case 7
        
        //TEST CASE 8
         System.out.println("\tTest case#8");
        height = 3.0;
        width = 5.0;
        length = 4.0;
        expResult = 60.0;
        
        result = instance.calcVolumeOfFont(height, width, length);
        
        assertEquals(expResult, result, 0.0);
        // TODO test case 8
        
        
        //Test Case 9
         System.out.println("\tTest case#9");
        height = 6.0;
        width = 10.0;
        length = 8.0;
        expResult = 480.0;
        
        result = instance.calcVolumeOfFont(height, width, length);
        
        assertEquals(expResult, result, 0.0);
        // TODO test case 2
    }
    
}

