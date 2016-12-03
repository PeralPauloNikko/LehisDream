/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.control;

import java.io.PrintWriter;
import lehisdream.LehisDream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author smith
 */
public class MapControlTest {
    protected final PrintWriter console = LehisDream.getOutFile();
    
    public MapControlTest() {
    }

    /**Team Assignment
     * Test of calcVolumeOfFont method, of class MapControl.
     */
    @Test
    public void testCalcVolumeOfFont() {
        
        this.console.println("calcVolumeOfFont");
        /************************************
         * Test Case #1
         ***********************************/
        this.console.println("\tTest case #1");
        
        //input values for test case 1
        double height = 5.0;
        double width = 7.0;
        double length = 6.0;
        
        double expResult = 210.0;//expected output returned value
        
        //create instance of MapControl class
        //MapControl instance = new MapControl();
        
        //call function to run test
//        double result = MapControl.calcVolumeOfFont(height, width, length);
//        
        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
        /************************************
         * Test Case #2
         ***********************************/
        this.console.println("\tTest case #2");
        
        //input values for test case 2
        height = 2.0;
        width = 5.0;
        length = 4.0;
        
        expResult = -1;//expected output returned value
        
        //call function to run test
//        result = MapControl.calcVolumeOfFont(height, width, length);
        
        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
        /************************************
         * Test Case #3
         ***********************************/
        this.console.println("\tTest case #3");
        
        //input values for test case 3
        height = 7.0;
        width = 5.0;
        length = 4.0;
        
        expResult = -1;//expected output returned value
        
        //call function to run test
//        result = MapControl.calcVolumeOfFont(height, width, length);
        
        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
        /************************************
         * Test Case #4
         ***********************************/
        this.console.println("\tTest case #4");
        
        //input values for test case 4
        height = 5.0;
        width = 4.0;
        length = 5.0;
        
        expResult = -2;//expected output returned value
        
        //call function to run test
//        result = MapControl.calcVolumeOfFont(height, width, length);
        
        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
        /************************************
         * Test Case #5
         ***********************************/
        this.console.println("\tTest case #5");
        
        //input values for test case 5
        height = 5.0;
        width = 11.0;
        length = 5.0;
        
        expResult = -2;//expected output returned value
        
        //call function to run test
//        result = MapControl.calcVolumeOfFont(height, width, length);
        
        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
        /************************************
         * Test Case #6
         ***********************************/
        this.console.println("\tTest case #6");
        
        //input values for test case 6
        height = 5.0;
        width = 9.0;
        length = 3.0;
        
        expResult = -3;//expected output returned value
        
        //call function to run test
//        result = MapControl.calcVolumeOfFont(height, width, length);
        
        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
        /************************************
         * Test Case #7
         ***********************************/
        this.console.println("\tTest case #7");
        
        //input values for test case 7
        height = 5.0;
        width = 9.0;
        length = 9.0;
        
        expResult = -3;//expected output returned value
        
        //call function to run test
//        result = MapControl.calcVolumeOfFont(height, width, length);
        
        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
        /************************************
         * Test Case #8
         ***********************************/
        this.console.println("\tTest case #8");
        
        //input values for test case 8
        height = 3.0;
        width =  5.0;
        length = 4.0;
        
        expResult = 60.0;//expected output returned value
        
        //call function to run test
//        result = MapControl.calcVolumeOfFont(height, width, length);
        
        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
        /************************************
         * Test Case #9
         ***********************************/
        this.console.println("\tTest case #9");
        
        //input values for test case 9
        height = 6.0;
        width = 10.0;
        length = 8.0;
        
        expResult = 480.0;//expected output returned value
        
        //call function to run test
//        result = MapControl.calcVolumeOfFont(height, width, length);
        
        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
    }
    /**April Individual Assignment**/
    /**
     * Test of calcSquareFeetOfHome method, of class MapControl.
     */
    @Test
    public void testCalcSquareFeetOfHome() {
        
        this.console.println("calcSquareFeetOfHome");
        /************************************
         * Test Case #1
         ***********************************/
        this.console.println("\tTest case #1");
        
        // input values for test case
        double length = 60.0;
        double width = 40.0;
        
        //expected output returned value
        double expResult = 2400.0;
        
        //create instance of MapControl class
        MapControl instance = new MapControl();
        
        //call function to run test
//        double result = instance.calcSquareFeetOfHome(length, width);
        //compare expected return value with actual value returned
        
//        assertEquals(expResult, result, 0.0);
        
         /************************************
         * Test Case #2
         ***********************************/
        this.console.println("\tTest case #2");
        
        // input values for test case
        length = -1;
        width =  500.0;
        
        //expected output returned value
        expResult = -1;
        
        //call function to run test
//        result = instance.calcSquareFeetOfHome(length, width);
        //compare expected return value with actual value returned
        
//        assertEquals(expResult, result, 0.0);
        
        /************************************
         * Test Case #3
         ***********************************/
        this.console.println("\tTest case #3");
        
        // input values for test case
        length = 700.0;
        width =  -1;
        
        //expected output returned value
        expResult = -2;
        
        //call function to run test
//        result = instance.calcSquareFeetOfHome(length, width);
        //compare expected return value with actual value returned
        
//        assertEquals(expResult, result, 0.0);
        
        /************************************
         * Test Case #4
         ***********************************/
        this.console.println("\tTest case #4");
        
        // input values for test case
        length = 600.0;
//        width =  0.0;
        
        //expected output returned value
        expResult = 0.0;
        
        //call function to run test
//        result = instance.calcSquareFeetOfHome(length, width);
        //compare expected return value with actual value returned
        
//        assertEquals(expResult, result, 0.0);
        
        /************************************
         * Test Case #5
         ***********************************/
        this.console.println("\tTest case #5");
        
        // input values for test case
        length = 0.0;
        width =  400.0;
        
        //expected output returned value
        expResult = 0.0;
        
        //call function to run test
//        result = instance.calcSquareFeetOfHome(length, width);
        //compare expected return value with actual value returned
        
//        assertEquals(expResult, result, 0.0);
        
    }
    
    
    
    
    
    
    
    
    
    
}       
